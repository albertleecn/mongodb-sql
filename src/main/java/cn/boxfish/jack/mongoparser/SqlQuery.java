package cn.boxfish.jack.mongoparser;

import java.sql.ResultSet;

/**
 * Created by lvtu on 2017/5/13.
 */
interface SqlQuery {
    ResultSet execute();
}
