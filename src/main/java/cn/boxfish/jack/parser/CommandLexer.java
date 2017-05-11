package cn.boxfish.jack.parser;

/**
 * Created by lvtu on 2017/5/10.
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


class Rule {
    private String command;
    private String ruleName;
    private AwardFlow awardFlow;
    private MatchCondition matchCondition;

    Rule(Object command, Object ruleName, Object matchCondition, Object awardFlow) {
        this((String) command, (String) ruleName, (MatchCondition) matchCondition, (AwardFlow) awardFlow);
    }

    Rule(String command, String ruleName, MatchCondition matchCondition, AwardFlow awardFlow) {
        this.command = command;
        this.ruleName = ruleName;
        this.matchCondition = matchCondition;
        this.awardFlow = awardFlow;
        printSql();
    }

    void printSql() {
        StringBuilder insertRule = new StringBuilder();
        insertRule.append("start TRANSACTION;\n");
        insertRule.append("insert into `rule` ( `name`, `rule_code`, `rule_condition`, `rule_flow`, `rule_state`, `desc`) values ( ");
        insertRule.append(wrapper(ruleName));//name
        insertRule.append(",");
        insertRule.append(wrapper(ruleName));//rule_code
        insertRule.append(",");
        //rule_condition
        insertRule.append(wrapper("user_id,IN," + String.join(":", matchCondition.getUserIds().getUserIds())));
        insertRule.append(",");
        //rule_flow
        List<Award> awards = awardFlow.getAwards();
        StringBuilder awardsBuilder = new StringBuilder();
        for (int i = 0; i < awards.size(); i++) {
            Award award = awards.get(i);
            for (int j = 0; j < award.getNum(); j++) {
                awardsBuilder.append(award.getAwardName()).append(";");
            }
        }
        insertRule.append(wrapper(awardsBuilder.toString()));
        insertRule.append(",");
        insertRule.append(wrapper("ENABLE"));
        insertRule.append(",");
        insertRule.append(wrapper("100"));
        insertRule.append(");");

        insertRule.append("\n");

        for (int i = 0; i < awards.size(); i++) {
            Award award = awards.get(i);
            for (int j = 0; j < award.getNum(); j++) {
                insertRule.append("insert into `activity_award_config` ( `activity_code`, `award_code`, `award_consumed_num`, `award_limit`, `award_limit_per_user`, `award_time_unit`) values ( ");
                //activity_code
                insertRule.append(wrapper(ruleName)).append(",");
                //award_code
                insertRule.append(wrapper(award.getAwardName())).append(",");
                //award_consumed_num
                insertRule.append(wrapper("0")).append(",");
                //award_limit
                insertRule.append(wrapper("1000")).append(",");
                //award_limit_per_user
                insertRule.append(wrapper("1000")).append(",");
                //award_time_unit
                insertRule.append(wrapper("NONE")).append(");\n");
            }
        }
        insertRule.append("COMMIT;");

        System.out.println(insertRule.toString());
    }

    String wrapper(String value) {
        return "'" + value + "'";
    }

}

class MatchCondition {
    private UserIds userIds;

    MatchCondition(Object userIds) {
        this.userIds = (UserIds) userIds;
    }

    public UserIds getUserIds() {
        return userIds;
    }
}

class UserIds {
    private List<String> userIds = new ArrayList();

    UserIds(Object num) {
        userIds.add(String.valueOf(num));
    }

    UserIds(Object userIds, Object num) {
        this.userIds.addAll(((UserIds) userIds).userIds);
        this.userIds.add(String.valueOf(num));
    }

    public List<String> getUserIds() {
        return userIds;
    }
}

class AwardFlow {
    private List<Award> awards = new ArrayList<Award>();

    AwardFlow(Object award1, Object award2) {
        awards.addAll(((AwardFlow) award1).awards);
        awards.add((Award) award2);
    }

    AwardFlow(Object award) {
        awards.add((Award) award);
    }

    public List<Award> getAwards() {
        return awards;
    }
}

class Award {
    private String awardName;
    private Integer num;

    Award(Object awardName, Object num) {
        this((String) awardName, (Integer) num);
    }

    Award(String awardName, Integer num) {
        this.awardName = awardName;
        this.num = num;
    }

    public String getAwardName() {
        return awardName;
    }

    public Integer getNum() {
        return num;
    }
}

class CommandLexer implements CommandTokens {

    private final static Logger logger = LoggerFactory.getLogger(CommandLexer.class);

    private static final Pattern whiteSpacePattern = Pattern.compile("^\\s");
    private static final Pattern identifierPattern = Pattern.compile("^[a-zA-Z]+(\\w|-|)*");
    private static final Pattern numPattern = Pattern.compile("^\\d+");
    private static final Pattern semiColonPattern = Pattern.compile("^;|\\(|\\)|:");


    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    private String command;

    void readCommand() {
        try {
            command = reader.readLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private int token;
    private Object yylval;

    /**
     * Read the next token and return the
     * corresponding integer code.
     */
    int nextToken() {
        logger.info("scan tokens: {}", command);
        Matcher identifierMatcher = identifierPattern.matcher(command);
        if (identifierMatcher.find()) {
            yylval = identifierMatcher.group();
            command = command.substring(identifierMatcher.end());
            return token = IDENTIFIER;
        }

        Matcher numMatcher = numPattern.matcher(command);
        if (numMatcher.find()) {
            yylval = Integer.valueOf(numMatcher.group());
            command = command.substring(numMatcher.end());
            return token = NUM;
        }

        Matcher whitespaceMatcher = whiteSpacePattern.matcher(command);
        if (whitespaceMatcher.find()) {
            yylval = whitespaceMatcher.group();
            command = command.substring(whitespaceMatcher.end());
            return token = WHITESPACE;
        }

        Matcher semiColonMatcher = semiColonPattern.matcher(command);
        if (semiColonMatcher.find()) {
            yylval = semiColonMatcher.group().charAt(0);
            command = command.substring(semiColonMatcher.end());
            return token = semiColonMatcher.group().charAt(0);
        }

        return ENDINPUT;
    }

    /**
     * Return the token code for the current lexeme.
     */
    int getToken() {
        return token;
    }

    /**
     * Return the semantic value for the current lexeme.
     */
    Object getSemantic() {
        return yylval;
    }
}

class Main {
    public static void main(String[] args) {
        CommandLexer lexer = new CommandLexer();
        lexer.readCommand();
        lexer.nextToken();
        CommandParser parser = new CommandParser(lexer);
        parser.parse();
    }

    static void error(String msg) {
        System.out.println("ERROR: " + msg);
        System.exit(1);
    }
}