package cn.boxfish.jack.mongoparser;

/**
 * Created by lvtu on 2017/5/15.
 */
public class MongoString {

    private String stringValue;

    MongoString(Object stringValue){
        stringValue = String.valueOf(stringValue);
    }

    public String getStringValue() {
        return stringValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }
}
