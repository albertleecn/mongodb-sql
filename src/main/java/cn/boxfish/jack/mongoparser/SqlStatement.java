package cn.boxfish.jack.mongoparser;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by lvtu on 2017/5/12.
 */
public class SqlStatement extends AbstractStatement {

    @Override
    public ResultSet executeQuery(String sql) throws SQLException {
        //parse SQL
        return super.executeQuery(sql);
    }

}
