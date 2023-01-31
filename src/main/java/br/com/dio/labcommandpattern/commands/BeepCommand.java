package br.com.dio.labcommandpattern.commands;

import br.com.dio.labcommandpattern.model.Robot;

public class BeepCommand implements Command {
    private Robot robot;

    public BeepCommand(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void execute() {
        this.robot.beep();
    }
}
