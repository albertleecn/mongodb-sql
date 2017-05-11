package cn.boxfish.jack.parser;

/**
 * Created by lvtu on 2017/5/11.
 */
class SingleArguments extends Arguments{
    private String ruleName;

    SingleArguments(Object rulename){
        this.ruleName = (String)rulename;
    }

    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }
}
