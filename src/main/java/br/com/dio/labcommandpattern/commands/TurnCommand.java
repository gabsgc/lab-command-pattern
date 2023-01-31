package br.com.dio.labcommandpattern.commands;

import br.com.dio.labcommandpattern.model.Robot;

public class TurnCommand implements Command {
    private Robot robot;

    public TurnCommand(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void execute() {
        this.robot.turn();
    }
}
