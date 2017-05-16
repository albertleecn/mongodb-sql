package cn.boxfish.jack;

import cn.boxfish.jack.mongoparser.sql.impl.MongoStatement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.ResultSet;

/**
 * Created by lvtu on 2017/5/16.
 */
public class MongoSQLExample {

    private final static Logger logger = LoggerFactory.getLogger(MongoSQLExample.class);

    public static void main(String[] args) {
        try {
            MongoStatement ms = new MongoStatement();
            String sql = "SELECT * FROM QA WHERE value = 'hello' ";
            ResultSet result = ms.executeQuery(sql);
            while(result.next()){
                logger.debug("result set is : {},{},{},{}", result.getString(1));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
