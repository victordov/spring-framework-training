package com.endava.internship.s_14_dependencies.s_02_detailed.v_03_innerbeans.domain;

public class Outer {

    private Inner inner;

    public void setInner(Inner inner) {
        this.inner = inner;
    }

    public boolean isInnerNull() {
        return inner == null;
    }

    @Override
    public String toString() {
        return "Outer{" +
            "inner=" + inner +
            '}';
    }
}
