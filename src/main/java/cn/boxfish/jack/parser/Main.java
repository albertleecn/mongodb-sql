package cn.boxfish.jack.parser;

/**
 * Created by lvtu on 2017/5/11.
 */
public class Main {
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