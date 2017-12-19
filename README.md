# mongodb-sql
use sql language to query mongo db

# for example
```JAVA
SELECT * FROM file_collection_map WHERE file_id = '1479369592543_42a034da-a8ea-4c45-96d4-66bb440f1a9f' AND state = '0' AND _id = '582d637877c82f9a8dd9b396'

(1)parse sql
(2)call spring API:
 16:33:28.389 [main] DEBUG org.springframework.data.mongodb.core.index.MongoPersistentEntityIndexCreator - Analyzing class interface java.util.Map for index information.
 16:33:28.399 [main] DEBUG org.springframework.data.mongodb.core.MongoTemplate - find using query: { "$and" : [ { "file_id" : "1479369592543_42a034da-a8ea-4c45-96d4-66bb440f1a9f"} , { "state" : "0"} , { "_id" : { "$oid" : "582d637877c82f9a8dd9b396"}}]} fields: null for class: interface java.util.Map in collection: file_collection_map
 16:33:28.402 [main] DEBUG org.springframework.data.mongodb.core.MongoDbUtils - Getting Mongo Database name=[mydb]
 16:33:28.416 [main] DEBUG cn.boxfish.jack.mongoparser.MongoSqlQuery - [{fullpath=/Users/lvtu/Desktop/temp/earthshaker_log/earthshaker.2016-11-11.0.log.gz, file_id=1479369592543_42a034da-a8ea-4c45-96d4-66bb440f1a9f, _id=582d637877c82f9a8dd9b396, state=0}]
(3)transform MAP to ResultSet
```

# Code State
this is a demo!!!

