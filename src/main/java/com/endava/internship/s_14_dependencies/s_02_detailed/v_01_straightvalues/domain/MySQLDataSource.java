package com.endava.internship.s_14_dependencies.s_02_detailed.v_01_straightvalues.domain;

public class MySQLDataSource {

    private String driverClassName;
    private String url;
    private String username;
    private String password;

    public void closeConnection() {
        System.out.println("Closing connection to database");
    }

    @Override
    public String toString() {
        return "MySQLDataSource{" +
            "driverClassName='" + driverClassName + '\'' +
            ", url='" + url + '\'' +
            ", username='" + username + '\'' +
            ", password='" + password + '\'' +
            '}';
    }

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
}
