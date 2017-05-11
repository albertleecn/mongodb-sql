package cn.boxfish.jack.parser;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lvtu on 2017/5/11.
 */
class UserIds {
    private List<String> userIds = new ArrayList();

    UserIds(Object num) {
        userIds.add(String.valueOf(num));
    }

    UserIds(Object userIds, Object num) {
        this.userIds.addAll(((UserIds) userIds).userIds);
        this.userIds.add(String.valueOf(num));
    }

    public List<String> getUserIds() {
        return userIds;
    }
}
