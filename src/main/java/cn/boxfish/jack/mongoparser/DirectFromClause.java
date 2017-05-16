package cn.boxfish.jack.mongoparser;

/**
 * Created by lvtu on 2017/5/12.
 */
class DirectFromClause extends AbstractFromClause {

    private String tableName;

    DirectFromClause(Object tableName){
        this.tableName = (String)tableName;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

}
