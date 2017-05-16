package cn.boxfish.jack.mongoparser.query;

import cn.boxfish.jack.mongoparser.*;
import org.springframework.data.mongodb.core.query.Criteria;

/**
 * Created by lvtu on 2017/5/15.
 */
public class Comparison {

    private RowValueConstructor leftOperand;
    private CompOp compOp;
    private RowValueConstructor rightOperand;

    public Comparison(Object leftOperand,Object compOp,Object rightOperand){
        this.leftOperand = (RowValueConstructor)leftOperand;
        this.compOp = (CompOp)compOp;
        this.rightOperand = (RowValueConstructor)rightOperand;
    }

    public Criteria criteria(){
        String key = null;
        Object leftValue = leftOperand.getRowValueConstructorElement().getElementValue();
        if(leftValue instanceof Field){
            key = ((Field)leftValue).getFieldName();
        }else{
            throw new RuntimeException("not support");
        }

        Object value = null;
        Object rightValue = rightOperand.getRowValueConstructorElement().getElementValue();
        if(rightValue instanceof MongoString){
            value = ((MongoString)rightValue).getStringValue();
        }else{
            throw new RuntimeException("not support");
        }

        switch (compOp.getCompOperator()) {
            case EQ:
                return Criteria.where(key).is(value);
            case GT:
                return Criteria.where(key).gt(value);
            case GTE:
                return Criteria.where(key).gte(value);
            case LT:
                return Criteria.where(key).lt(value);
            case LTE:
                return Criteria.where(key).lte(value);
            case NE:
                return Criteria.where(key).ne(value);
            default:
        }

        throw new RuntimeException("compOp error.");
    }

}
