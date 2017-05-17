package cn.boxfish.jack;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by lvtu on 2017/5/16.
 */
public class MongoSQLExample {

    private final static Logger logger = LoggerFactory.getLogger(MongoSQLExample.class);

    public static void main(String[] args){
//        try {
//            MongoStatement ms = new MongoStatement();
//            String sql = "SELECT * FROM file_collection_map WHERE file_id = '1479369592543_42a034da-a8ea-4c45-96d4-66bb440f1a9f' AND state = '0'";
//            ResultSet result = ms.executeQuery(sql);
//            while(result.next()){
//                logger.debug("result set is : {},{},{},{}", result.getString(1));
//            }
//        }catch (Exception e){
//            e.printStackTrace();
//        }finally {
//            System.out.println("finally");
//        }

        System.out.println(new MongoSQLExample().work());
    }

    public int work() {
        int result = 0;
        try {
            System.out.println("try block");
            result++;
            return result;
        } catch (Exception e) {
            System.err.println("catch block,result=");
        } finally {
            System.out.println("finally block,result=");
            result++;
        }

        return result;
    }

}
