package cn.boxfish.jack.parser;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lvtu on 2017/5/11.
 */
class AwardFlow {
    private List<Award> awards = new ArrayList<Award>();

    AwardFlow(Object award1, Object award2) {
        awards.addAll(((AwardFlow) award1).awards);
        awards.add((Award) award2);
    }

    AwardFlow(Object award) {
        awards.add((Award) award);
    }

    public List<Award> getAwards() {
        return awards;
    }
}
