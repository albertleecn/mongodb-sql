package cn.boxfish.jack.mongoparser;

/**
 * Created by lvtu on 2017/5/15.
 */
public class RowValueConstructor {

    private RowValueConstructorElement rowValueConstructorElement;

    RowValueConstructor(Object rowValueConstructorElement) {
        this.rowValueConstructorElement = (RowValueConstructorElement) rowValueConstructorElement;
    }

    public RowValueConstructorElement getRowValueConstructorElement() {
        return rowValueConstructorElement;
    }

    public void setRowValueConstructorElement(RowValueConstructorElement rowValueConstructorElement) {
        this.rowValueConstructorElement = rowValueConstructorElement;
    }
}
