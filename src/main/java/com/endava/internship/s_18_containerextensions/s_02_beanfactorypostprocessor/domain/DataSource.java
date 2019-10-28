package com.endava.internship.s_18_containerextensions.s_02_beanfactorypostprocessor.domain;

public class DataSource {
    private String driverClassName;
    private String url;
    private String username;
    private String password;

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "DataSource{" +
            "driverClassName='" + driverClassName + '\'' +
            ", url='" + url + '\'' +
            ", username='" + username + '\'' +
            ", password='" + password + '\'' +
            '}';
    }
}
