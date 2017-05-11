package cn.boxfish.jack.parser;

/**
 * Created by lvtu on 2017/5/11.
 */
class MatchCondition {
    private UserIds userIds;

    MatchCondition(Object userIds) {
        this.userIds = (UserIds) userIds;
    }

    public UserIds getUserIds() {
        return userIds;
    }
}
