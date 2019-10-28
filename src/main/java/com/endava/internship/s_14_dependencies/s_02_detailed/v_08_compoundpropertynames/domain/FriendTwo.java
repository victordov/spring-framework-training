package com.endava.internship.s_14_dependencies.s_02_detailed.v_08_compoundpropertynames.domain;

public class FriendTwo {

    private FriendThree friendThree;

    public FriendThree getFriendThree() {
        return friendThree;
    }

    public void setFriendThree(FriendThree friendThree) {
        this.friendThree = friendThree;
    }

    @Override
    public String toString() {
        return "FriendTwo{" +
            "friendThree=" + friendThree +
            '}';
    }
}
