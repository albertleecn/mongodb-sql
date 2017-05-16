package cn.boxfish.jack.mongoparser;

import cn.boxfish.jack.mongoparser.query.Comparison;

/**
 * Created by lvtu on 2017/5/15.
 */
public class WhereClauseToCriteria extends AbstractWhereClause{

    private Comparison comparison;

    WhereClauseToCriteria(Object comparison){
        this.comparison = (Comparison)comparison;
    }

    public Comparison getComparison() {
        return comparison;
    }

    public void setComparison(Comparison comparison) {
        this.comparison = comparison;
    }
}
