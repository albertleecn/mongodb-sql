package cn.boxfish.jack.mongoparser.query;

import cn.boxfish.jack.mongoparser.*;
import org.springframework.data.mongodb.core.query.Criteria;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by lvtu on 2017/5/15.
 */
public class Comparison {

    private List<Comparison> comparisons = new ArrayList<>();

    private RowValueConstructor leftOperand;
    private CompOp compOp;
    private RowValueConstructor rightOperand;

    public Comparison() {

    }

    public Comparison(Object leftOperand, Object compOp, Object rightOperand) {
        this.leftOperand = (RowValueConstructor) leftOperand;
        this.compOp = (CompOp) compOp;
        this.rightOperand = (RowValueConstructor) rightOperand;

        comparisons.add(this);
    }

    public static Comparison and(Object com1, Object com2) {
        Comparison comparison = new Comparison();

        comparison.comparisons.addAll(((Comparison) com1).comparisons);
        comparison.comparisons.addAll(((Comparison) com2).comparisons);

        return comparison;
    }

    public Criteria criterias() {
        Criteria allCriterias = new Criteria();
        List<Criteria> collect = comparisons.stream().map(comparison -> comparison.criteria()).collect(Collectors.toList());
        Criteria[] criterias = new Criteria[collect.size()];
        for (int i = 0; i < collect.size(); i++) {
            criterias[i] = collect.get(i);
        }
        allCriterias.andOperator(criterias);
        return allCriterias;
    }

    public Criteria criteria() {
        String key;
        Object leftValue = leftOperand.getRowValueConstructorElement().getElementValue();
        if (leftValue instanceof Field) {
            key = ((Field) leftValue).getFieldName();
        } else {
            throw new RuntimeException("not support");
        }

        Object value = null;
        Object rightValue = rightOperand.getRowValueConstructorElement().getElementValue();
        if (rightValue instanceof MongoString) {
            value = ((MongoString) rightValue).getStringValue();
        } else if (rightValue instanceof Integer) {
            value = rightValue;
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
