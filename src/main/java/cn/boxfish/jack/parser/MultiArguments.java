package cn.boxfish.jack.parser;

/**
 * Created by lvtu on 2017/5/11.
 */
class MultiArguments extends Arguments{
    private String ruleName;
    private MatchCondition matchCondition;
    private AwardFlow awardFlow;

    MultiArguments(Object ruleName, Object matchCondition, Object awardFlow){
        this.ruleName = (String)ruleName;
        this.matchCondition = (MatchCondition)matchCondition;
        this.awardFlow = (AwardFlow)awardFlow;
    }

    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    public AwardFlow getAwardFlow() {
        return awardFlow;
    }

    public void setAwardFlow(AwardFlow awardFlow) {
        this.awardFlow = awardFlow;
    }

    public MatchCondition getMatchCondition() {
        return matchCondition;
    }

    public void setMatchCondition(MatchCondition matchCondition) {
        this.matchCondition = matchCondition;
    }
}

