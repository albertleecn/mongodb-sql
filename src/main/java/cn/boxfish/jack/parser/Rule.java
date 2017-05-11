package cn.boxfish.jack.parser;

import java.util.List;

/**
 * Created by lvtu on 2017/5/11.
 */
class Rule {
    private String ruleName;
    private AwardFlow awardFlow;
    private MatchCondition matchCondition;

    Rule(String ruleName, MatchCondition matchCondition, AwardFlow awardFlow) {
        this.ruleName = ruleName;
        this.matchCondition = matchCondition;
        this.awardFlow = awardFlow;
    }

    void deleteRule(){
        StringBuilder deleteSql = new StringBuilder();
        deleteSql.append("delete from rule where rule_code =").append(wrapper(ruleName)).append(";\n");
        deleteSql.append("delete from activity_award_config where activity_code = ").append(wrapper(ruleName)).append(";\n");
        System.out.println(deleteSql.toString());
    }

    void createRule() {
        StringBuilder insertRule = new StringBuilder();
        insertRule.append("start TRANSACTION;\n");
        insertRule.append("insert into `rule` ( `name`, `rule_code`, `rule_condition`, `rule_flow`, `rule_state`, `desc`) values ( ");
        insertRule.append(wrapper(ruleName));//name
        insertRule.append(",");
        insertRule.append(wrapper(ruleName));//rule_code
        insertRule.append(",");
        //rule_condition
        insertRule.append(wrapper("user_id,IN," + String.join(":", matchCondition.getUserIds().getUserIds())));
        insertRule.append(",");
        //rule_flow
        List<Award> awards = awardFlow.getAwards();
        StringBuilder awardsBuilder = new StringBuilder();
        for (int i = 0; i < awards.size(); i++) {
            Award award = awards.get(i);
            for (int j = 0; j < award.getNum(); j++) {
                awardsBuilder.append(award.getAwardName()).append(";");
            }
        }
        insertRule.append(wrapper(awardsBuilder.toString()));
        insertRule.append(",");
        insertRule.append(wrapper("ENABLE"));
        insertRule.append(",");
        insertRule.append(wrapper("100"));
        insertRule.append(");");

        insertRule.append("\n");

        for (int i = 0; i < awards.size(); i++) {
            Award award = awards.get(i);
            for (int j = 0; j < award.getNum(); j++) {
                insertRule.append("insert into `activity_award_config` ( `activity_code`, `award_code`, `award_consumed_num`, `award_limit`, `award_limit_per_user`, `award_time_unit`) values ( ");
                //activity_code
                insertRule.append(wrapper(ruleName)).append(",");
                //award_code
                insertRule.append(wrapper(award.getAwardName())).append(",");
                //award_consumed_num
                insertRule.append(wrapper("0")).append(",");
                //award_limit
                insertRule.append(wrapper("1000")).append(",");
                //award_limit_per_user
                insertRule.append(wrapper("1000")).append(",");
                //award_time_unit
                insertRule.append(wrapper("NONE")).append(");\n");
            }
        }
        insertRule.append("COMMIT;");

        System.out.println(insertRule.toString());
    }

    String wrapper(String value) {
        return "'" + value + "'";
    }

}