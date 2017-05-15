package cn.boxfish.jack.mongoparser;

import java.sql.ResultSet;

/**
 * Created by lvtu on 2017/5/12.
 */
class SubFromClause extends AbstractFromClause implements SqlQuery {

    private SqlQuery subSqlQuery;

    public ResultSet execute(){
        return subSqlQuery.execute();
    }

}
