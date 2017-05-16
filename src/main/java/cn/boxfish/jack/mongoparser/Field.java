package cn.boxfish.jack.mongoparser;

/**
 * Created by lvtu on 2017/5/15.
 */
public class Field {

    private String fieldName;

    Field(Object fieldName){
        fieldName = (String)fieldName;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }
}
