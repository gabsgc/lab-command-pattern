package br.com.dio.labcommandpattern.commands;

import br.com.dio.labcommandpattern.model.Robot;

public class MoveCommand implements Command {
    private Robot robot;
    private String robotName;

    public MoveCommand(Robot robot, String robotName) {
        this.robot = robot;
        this.robotName = robotName;
    }

    @Override
    public void execute() {
        this.robot.move(robotName);
    }
}
