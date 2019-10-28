package com.endava.internship.s_14_dependencies.s_01_dependencyinjection.s_0_1_constructorbased.domain;

public class CommandExecutor {

    private FirstCommand firstCommand;
    private SecondCommand secondCommand;
    private String executedBy;

    public CommandExecutor(String executedBy,
                           FirstCommand firstCommand,
                           SecondCommand secondCommand) {
        this.executedBy = executedBy;
        this.firstCommand = firstCommand;
        this.secondCommand = secondCommand;
    }

    public void executeCommands() {
        String format = "Command %s executed with status %b by %s%n";
        System.out.format(format, firstCommand.getClass().getSimpleName().toLowerCase(),
            firstCommand.execute(), executedBy);
        System.out.format(format, secondCommand.getClass().getSimpleName().toLowerCase(),
            secondCommand.execute(), executedBy);
    }
}
