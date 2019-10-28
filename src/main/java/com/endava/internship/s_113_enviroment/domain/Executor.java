package com.endava.internship.s_113_enviroment.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Executor {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void run() {
        final String sql = "SELECT * FROM cars";
        final List<Car> cars = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Car.class));
        cars.forEach(System.out::println);
    }
}
