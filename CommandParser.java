// Output created by jacc on Wed May 10 15:32:37 CST 2017

package cn.boxfish.jack.parser;

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
          System.out.println(command + " " + " " + ruleName + " " + matchCondition + " " + awardFlow);
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
          System.out.println(command);
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



class CommandParser implements CommandTokens {
    private int yyss = 100;
    private int yytok;
    private int yysp = 0;
    private int[] yyst;
    protected int yyerrno = (-1);
    private Object[] yysv;
    private Object yyrv;

    public boolean parse() {
        int yyn = 0;
        yysp = 0;
        yyst = new int[yyss];
        yysv = new Object[yyss];
        yytok = (lexer.getToken()
                 );
    loop:
        for (;;) {
            switch (yyn) {
                case 0:
                    yyst[yysp] = 0;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 30:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 3;
                            continue;
                    }
                    yyn = 63;
                    continue;

                case 1:
                    yyst[yysp] = 1;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 31:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = 60;
                            continue;
                    }
                    yyn = 63;
                    continue;

                case 2:
                    yyst[yysp] = 2;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 32:
                    switch (yytok) {
                        case WHITESPACE:
                            yyn = 4;
                            continue;
                    }
                    yyn = 63;
                    continue;

                case 3:
                    yyst[yysp] = 3;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 33:
                    switch (yytok) {
                        case WHITESPACE:
                            yyn = yyr7();
                            continue;
                    }
                    yyn = 63;
                    continue;

                case 4:
                    yyst[yysp] = 4;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 34:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 6;
                            continue;
                    }
                    yyn = 63;
                    continue;

                case 5:
                    yyst[yysp] = 5;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 35:
                    switch (yytok) {
                        case WHITESPACE:
                            yyn = 8;
                            continue;
                        case '(':
                            yyn = yyr6();
                            continue;
                    }
                    yyn = 63;
                    continue;

                case 6:
                    yyst[yysp] = 6;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 36:
                    switch (yytok) {
                        case WHITESPACE:
                        case '(':
                            yyn = yyr8();
                            continue;
                    }
                    yyn = 63;
                    continue;

                case 7:
                    yyst[yysp] = 7;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 37:
                    switch (yytok) {
                        case '(':
                            yyn = 10;
                            continue;
                    }
                    yyn = 63;
                    continue;

                case 8:
                    yyst[yysp] = 8;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 38:
                    switch (yytok) {
                        case ':':
                        case ')':
                        case NUM:
                        case error:
                            yyn = 63;
                            continue;
                    }
                    yyn = yyr5();
                    continue;

                case 9:
                    yyst[yysp] = 9;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 39:
                    switch (yytok) {
                        case WHITESPACE:
                            yyn = 8;
                            continue;
                        case IDENTIFIER:
                            yyn = yyr6();
                            continue;
                    }
                    yyn = 63;
                    continue;

                case 10:
                    yyst[yysp] = 10;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 40:
                    switch (yytok) {
                        case NUM:
                            yyn = 14;
                            continue;
                    }
                    yyn = 63;
                    continue;

                case 11:
                    yyst[yysp] = 11;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 41:
                    switch (yytok) {
                        case WHITESPACE:
                            yyn = 8;
                            continue;
                        case ';':
                            yyn = 17;
                            continue;
                        case ENDINPUT:
                            yyn = yyr6();
                            continue;
                    }
                    yyn = 63;
                    continue;

                case 12:
                    yyst[yysp] = 12;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 42:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 19;
                            continue;
                    }
                    yyn = 63;
                    continue;

                case 13:
                    yyst[yysp] = 13;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 43:
                    switch (yytok) {
                        case ')':
                            yyn = 20;
                            continue;
                        case ':':
                            yyn = 21;
                            continue;
                    }
                    yyn = 63;
                    continue;

                case 14:
                    yyst[yysp] = 14;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 44:
                    switch (yytok) {
                        case ':':
                        case ')':
                            yyn = yyr11();
                            continue;
                    }
                    yyn = 63;
                    continue;

                case 15:
                    yyst[yysp] = 15;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 45:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = yyr1();
                            continue;
                    }
                    yyn = 63;
                    continue;

                case 16:
                    yyst[yysp] = 16;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 46:
                    switch (yytok) {
                        case ';':
                            yyn = 22;
                            continue;
                        case ENDINPUT:
                            yyn = yyr2();
                            continue;
                    }
                    yyn = 63;
                    continue;

                case 17:
                    yyst[yysp] = 17;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 47:
                    switch (yytok) {
                        case WHITESPACE:
                            yyn = 8;
                            continue;
                        case ENDINPUT:
                            yyn = yyr3();
                            continue;
                        case IDENTIFIER:
                            yyn = yyr6();
                            continue;
                    }
                    yyn = 63;
                    continue;

                case 18:
                    yyst[yysp] = 18;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 48:
                    switch (yytok) {
                        case WHITESPACE:
                            yyn = 8;
                            continue;
                        case ENDINPUT:
                        case ';':
                            yyn = yyr6();
                            continue;
                    }
                    yyn = 63;
                    continue;

                case 19:
                    yyst[yysp] = 19;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 49:
                    switch (yytok) {
                        case WHITESPACE:
                            yyn = 25;
                            continue;
                    }
                    yyn = 63;
                    continue;

                case 20:
                    yyst[yysp] = 20;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 50:
                    switch (yytok) {
                        case WHITESPACE:
                        case IDENTIFIER:
                            yyn = yyr9();
                            continue;
                    }
                    yyn = 63;
                    continue;

                case 21:
                    yyst[yysp] = 21;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 51:
                    switch (yytok) {
                        case NUM:
                            yyn = 26;
                            continue;
                    }
                    yyn = 63;
                    continue;

                case 22:
                    yyst[yysp] = 22;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 52:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = yyr4();
                            continue;
                    }
                    yyn = 63;
                    continue;

                case 23:
                    yyst[yysp] = 23;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 53:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 19;
                            continue;
                    }
                    yyn = 63;
                    continue;

                case 24:
                    yyst[yysp] = 24;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 54:
                    switch (yytok) {
                        case WHITESPACE:
                        case ENDINPUT:
                        case ';':
                            yyn = yyr13();
                            continue;
                    }
                    yyn = 63;
                    continue;

                case 25:
                    yyst[yysp] = 25;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 55:
                    switch (yytok) {
                        case NUM:
                            yyn = 28;
                            continue;
                    }
                    yyn = 63;
                    continue;

                case 26:
                    yyst[yysp] = 26;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 56:
                    switch (yytok) {
                        case ':':
                        case ')':
                            yyn = yyr10();
                            continue;
                    }
                    yyn = 63;
                    continue;

                case 27:
                    yyst[yysp] = 27;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 57:
                    switch (yytok) {
                        case WHITESPACE:
                            yyn = 8;
                            continue;
                        case ENDINPUT:
                        case ';':
                            yyn = yyr6();
                            continue;
                    }
                    yyn = 63;
                    continue;

                case 28:
                    yyst[yysp] = 28;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 58:
                    switch (yytok) {
                        case WHITESPACE:
                        case ENDINPUT:
                        case ';':
                            yyn = yyr14();
                            continue;
                    }
                    yyn = 63;
                    continue;

                case 29:
                    yyst[yysp] = 29;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 59:
                    switch (yytok) {
                        case WHITESPACE:
                        case ENDINPUT:
                        case ';':
                            yyn = yyr12();
                            continue;
                    }
                    yyn = 63;
                    continue;

                case 60:
                    return true;
                case 61:
                    yyerror("stack overflow");
                case 62:
                    return false;
                case 63:
                    yyerror("syntax error");
                    return false;
            }
        }
    }

    protected void yyexpand() {
        int[] newyyst = new int[2*yyst.length];
        Object[] newyysv = new Object[2*yyst.length];
        for (int i=0; i<yyst.length; i++) {
            newyyst[i] = yyst[i];
            newyysv[i] = yysv[i];
        }
        yyst = newyyst;
        yysv = newyysv;
    }

    private int yyr1() { // prog : command WHITESPACE rulename white matchCondition awardflow end
        { yyrv = new Rule(yysv[yysp-7],yysv[yysp-5],yysv[yysp-3],yysv[yysp-2]); }
        yysv[yysp-=7] = yyrv;
        return 1;
    }

    private int yyr12() { // awardflow : awardflow ';' white award white
        { yyrv = new AwardFlow(yysv[yysp-5],yysv[yysp-2]); }
        yysv[yysp-=5] = yyrv;
        return 11;
    }

    private int yyr13() { // awardflow : white award white
        { yyrv = new AwardFlow(yysv[yysp-2]); }
        yysv[yysp-=3] = yyrv;
        return 11;
    }

    private int yyr7() { // command : IDENTIFIER
        yysp -= 1;
        return 2;
    }

    private int yyr2() { // end : white
        yysp -= 1;
        return 15;
    }

    private int yyr3() { // end : ';'
        yysp -= 1;
        return 15;
    }

    private int yyr4() { // end : white ';'
        yysp -= 2;
        return 15;
    }

    private int yyr9() { // matchCondition : '(' userIds ')'
        { yyrv = new MatchCondition(yysv[yysp-2]); }
        yysv[yysp-=3] = yyrv;
        return 9;
    }

    private int yyr14() { // award : IDENTIFIER WHITESPACE NUM
        { yyrv = new Award(yysv[yysp-3],yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        switch (yyst[yysp-1]) {
            case 12: return 18;
            default: return 27;
        }
    }

    private int yyr8() { // rulename : IDENTIFIER
        yysp -= 1;
        return 5;
    }

    private int yyr10() { // userIds : userIds ':' NUM
        { yyrv = new UserIds(yysv[yysp-3],yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return 13;
    }

    private int yyr11() { // userIds : NUM
        { yyrv = new UserIds(yysv[yysp-1]); }
        yysv[yysp-=1] = yyrv;
        return 13;
    }

    private int yyr5() { // white : WHITESPACE
        yysp -= 1;
        return yypwhite();
    }

    private int yyr6() { // white : /* empty */
        return yypwhite();
    }

    private int yypwhite() {
        switch (yyst[yysp-1]) {
            case 18: return 24;
            case 17: return 23;
            case 11: return 16;
            case 9: return 12;
            case 5: return 7;
            default: return 29;
        }
    }

    protected String[] yyerrmsgs = {
    };


  private CommandLexer lexer;

  CommandParser(CommandLexer lexer) { this.lexer = lexer; }

  private void yyerror(String msg) {
    Main.error(yyerrno<0 ? msg : yyerrmsgs[yyerrno]);
  }

}
