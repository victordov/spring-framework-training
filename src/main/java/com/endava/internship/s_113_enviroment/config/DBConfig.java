package com.endava.internship.s_113_enviroment.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

@Configuration
@PropertySource("classpath:db/db.properties")
public class DBConfig {

    @Value("${db.schema}")
    private String schema;

    @Value("${db.data}")
    private String data;

    @Bean
    public DataSource dataSource() {
        final EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();
        return builder
            .setType(EmbeddedDatabaseType.H2) // HSQL or DERBY
            .addScript(schema)
            .addScript(data)
            .build();
    }

    @Bean(destroyMethod="")
    public DataSource dataSourceProd() throws Exception {
        Context ctx = new InitialContext();
        return (DataSource) ctx.lookup("java:comp/env/jdbc/datasource");
    }

    @Bean
    public JdbcTemplate createJdbcTeamplate() {
        final JdbcTemplate template = new JdbcTemplate();
        template.setDataSource(dataSource());
        return template;
    }
}
