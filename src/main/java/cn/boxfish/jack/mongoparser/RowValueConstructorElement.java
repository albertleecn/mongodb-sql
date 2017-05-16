package cn.boxfish.jack.mongoparser;

/**
 * Created by lvtu on 2017/5/15.
 */
public class RowValueConstructorElement {

    private Object elementValue;

    RowValueConstructorElement(Object elementValue){
        elementValue = elementValue;
    }

    public Object getElementValue() {
        return elementValue;
    }

    public void setElementValue(Object elementValue) {
        this.elementValue = elementValue;
    }
}
