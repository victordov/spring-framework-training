package com.endava.internship.s_14_dependencies.s_02_detailed.v_03_innerbeans.domain;

public class Inner {

    private String name;
    private String age;

    @Override
    public String toString() {
        return "Inner{" +
            "name='" + name + '\'' +
            ", age='" + age + '\'' +
            '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
