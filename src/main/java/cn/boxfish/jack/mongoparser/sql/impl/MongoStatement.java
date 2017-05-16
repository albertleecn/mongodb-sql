package cn.boxfish.jack.mongoparser.sql.impl;

import cn.boxfish.jack.mongoparser.SelectParser;
import cn.boxfish.jack.mongoparser.TokenLexer;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by lvtu on 2017/5/16.
 */
public class MongoStatement extends AbstractStatement {

    @Override
    public ResultSet executeQuery(String sql) throws SQLException {
        TokenLexer lexer = new TokenLexer();
        lexer.readCommand(sql);
        lexer.nextToken();
        SelectParser parser = new SelectParser(lexer);
        parser.parse();
        return parser.getResultSet();
    }
}
