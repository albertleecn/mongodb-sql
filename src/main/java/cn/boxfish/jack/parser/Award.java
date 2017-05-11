package cn.boxfish.jack.parser;

/**
 * Created by lvtu on 2017/5/11.
 */
class Award {
    private String awardName;
    private Integer num;

    Award(Object awardName, Object num) {
        this((String) awardName, (Integer) num);
    }

    Award(String awardName, Integer num) {
        this.awardName = awardName;
        this.num = num;
    }

    public String getAwardName() {
        return awardName;
    }

    public Integer getNum() {
        return num;
    }
}
