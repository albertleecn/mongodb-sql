package cn.boxfish.jack.mongoparser;

import java.sql.ResultSet;

/**
 * Created by lvtu on 2017/5/13.
 */
class MongoSqlQuery implements SqlQuery {

    private AbstractSelectClause selectClause;
    private AbstractFromClause fromClause;
    private AbstractWhereClause whereClause;

    public ResultSet execute(){
        if(fromClause instanceof  DirectFromClause){
            DirectFromClause from  = (DirectFromClause)fromClause;
            String collectionName = from.getTableName();
            //TODO transform whereClause to mongodb query
            return new MongoResultSet();
        }else if(fromClause instanceof  SubFromClause){
            SubFromClause from  = (SubFromClause)fromClause;
            ResultSet execute = from.execute();

        }else{

        }
        return null;
    }
}
