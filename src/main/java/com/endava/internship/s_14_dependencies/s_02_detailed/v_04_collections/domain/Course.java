package com.endava.internship.s_14_dependencies.s_02_detailed.v_04_collections.domain;

public class Course {

    private String name;
    private Integer nrOfLessons;

    public void setName(String name) {
        this.name = name;
    }

    public void setNrOfLessons(Integer nrOfLessons) {
        this.nrOfLessons = nrOfLessons;
    }

    @Override
    public String toString() {
        return "Course{" +
            "name='" + name + '\'' +
            ", nrOfLessons=" + nrOfLessons +
            '}';
    }
}
