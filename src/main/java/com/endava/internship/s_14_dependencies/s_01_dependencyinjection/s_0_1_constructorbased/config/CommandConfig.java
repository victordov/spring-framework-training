package com.endava.internship.s_14_dependencies.s_01_dependencyinjection.s_0_1_constructorbased.config;


import com.endava.internship.s_14_dependencies.s_01_dependencyinjection.s_0_1_constructorbased.domain.CommandExecutor;
import com.endava.internship.s_14_dependencies.s_01_dependencyinjection.s_0_1_constructorbased.domain.FirstCommand;
import com.endava.internship.s_14_dependencies.s_01_dependencyinjection.s_0_1_constructorbased.domain.SecondCommand;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CommandConfig {

    @Bean(value = "firstCommand")
    public FirstCommand firstCommand() {
        return new FirstCommand();
    }

    @Bean(value = "secondCommand")
    public SecondCommand secondCommand() {
        return new SecondCommand();
    }

    @Bean(value = "commandExecutor")
    public CommandExecutor commandExecutor() {
        return new CommandExecutor("myComputer", firstCommand(), secondCommand());
    }
}
