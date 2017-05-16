package cn.boxfish.jack.mongoparser;

import cn.boxfish.jack.mongoparser.sql.impl.MongoResultSet;
import com.mongodb.MongoClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.sql.ResultSet;
import java.util.List;
import java.util.Map;

/**
 * Created by lvtu on 2017/5/13.
 */
class MongoSqlQuery implements SqlQuery {

    private final static Logger logger = LoggerFactory.getLogger(MongoSqlQuery.class);

    private AbstractSelectClause selectClause;
    private AbstractFromClause fromClause;
    private AbstractWhereClause whereClause;


    MongoSqlQuery(Object selectClause,Object fromClause,Object whereClause){
            this.selectClause = (AbstractSelectClause)selectClause;
            this.fromClause = (AbstractFromClause)fromClause;
            this.whereClause = (AbstractWhereClause)whereClause;
    }


    public ResultSet execute(){
        try {
            if (fromClause instanceof DirectFromClause) {
                DirectFromClause from = (DirectFromClause) fromClause;
                String collectionName = from.getTableName();
                Criteria criteria = ((WhereClauseToCriteria) whereClause).getComparison().criteria();
                MongoOperations mongoOps = new MongoTemplate(new SimpleMongoDbFactory(new MongoClient("127.0.0.1", 27017), "mydb"));
                List<Map> maps = mongoOps.find(new Query(criteria), Map.class, collectionName);
                logger.debug("{}", maps);
                return new MongoResultSet();
            } else if (fromClause instanceof SubFromClause) {
                SubFromClause from = (SubFromClause) fromClause;
                ResultSet execute = from.execute();

            } else {

            }
            return null;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
