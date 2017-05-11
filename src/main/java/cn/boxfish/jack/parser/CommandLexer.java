package cn.boxfish.jack.parser;

/**
 * Created by lvtu on 2017/5/10.
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

