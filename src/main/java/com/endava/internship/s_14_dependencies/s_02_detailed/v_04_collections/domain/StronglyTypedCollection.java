package com.endava.internship.s_14_dependencies.s_02_detailed.v_04_collections.domain;

import java.util.Map;

public class StronglyTypedCollection {

    private Map<String, Float> accounts;

    public void setAccounts(Map<String, Float> accounts) {
        this.accounts = accounts;
    }

    @Override
    public String toString() {
        return "StronglyTypedCollection{" +
            "accounts=" + accounts +
            '}';
    }
}
