package com.endava.internship.s_14_dependencies.s_02_detailed.v_05_nullandempty.domain;

public class CourseNullAndEmpty {

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
        return "CourseNullAndEmpty{" +
            "name='" + name + '\'' +
            ", nrOfLessons=" + nrOfLessons +
            '}';
    }
}
