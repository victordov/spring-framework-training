package com.endava.internship.s_14_dependencies.s_02_detailed.v_08_compoundpropertynames.domain;

public class FriendOne {

    private FriendTwo friendTwo;

    public FriendTwo getFriendTwo() {
        return friendTwo;
    }

    public void setFriendTwo(FriendTwo friendTwo) {
        this.friendTwo = friendTwo;
    }

    @Override
    public String toString() {
        return "FriendOne{" +
            "friendTwo=" + friendTwo +
            '}';
    }
}
