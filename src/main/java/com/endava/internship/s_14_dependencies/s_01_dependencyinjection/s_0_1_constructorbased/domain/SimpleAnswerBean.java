package com.endava.internship.s_14_dependencies.s_01_dependencyinjection.s_0_1_constructorbased.domain;

import java.beans.ConstructorProperties;

/**
 * Constructor Based DI:
 * <ul>
 *  <li>by value (auto)</li>
 *  <li>by name</li>
 *  <li>by type</li>
 *  <li>by index</li>
 *  </ul>
 */
public class SimpleAnswerBean {

    private final String ultimateAnswer;
    private final int years;

    @ConstructorProperties({"ultimateAnswer", "nrAnswer"})
    public SimpleAnswerBean(String ultimateAnswer, int nrAnswer) {
        this.ultimateAnswer = ultimateAnswer;
        this.years = nrAnswer;
    }

    @Override
    public String toString() {
        return ultimateAnswer + years;
    }
}
