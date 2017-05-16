package cn.boxfish.jack.mongoparser;

/**
 * Created by lvtu on 2017/5/15.
 */
public class CompOp {

    public enum CompOperator{
        EQ, GT, GTE, LT, LTE, NE
    }

    private CompOperator compOperator;

    CompOp(String compOperator){
        this.compOperator = CompOperator.valueOf(compOperator);
    }

    public CompOperator getCompOperator() {
        return compOperator;
    }

    public void setCompOperator(CompOperator compOperator) {
        this.compOperator = compOperator;
    }
}
