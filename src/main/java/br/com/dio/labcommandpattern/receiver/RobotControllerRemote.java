package br.com.dio.labcommandpattern.receiver;

import br.com.dio.labcommandpattern.commands.BeepCommand;
import br.com.dio.labcommandpattern.commands.Command;
import br.com.dio.labcommandpattern.commands.MoveCommand;
import br.com.dio.labcommandpattern.commands.TurnCommand;
import br.com.dio.labcommandpattern.invoker.Button;
import br.com.dio.labcommandpattern.invoker.IButton;
import br.com.dio.labcommandpattern.model.Robot;

import java.util.ArrayList;

public class RobotControllerRemote {
    private IButton moveButton;
    private IButton turnButton;
    private IButton beepButton;
    private Robot robot;
    private ArrayList<Command> history = new ArrayList<>();

    public RobotControllerRemote(Robot robot) {
        this.robot = robot;
        setCommandsToButtons();
    }

    private void setCommandsToButtons() {
        moveButton = new Button(new MoveCommand(this.robot, this.robot.getName()));
        turnButton = new Button(new TurnCommand(this.robot));
        beepButton = new Button(new BeepCommand(this.robot));
    }

    public void move() {
        this.moveButton.press();
        history.add(this.moveButton.getCommand());
    }

    public void turn() {
        this.turnButton.press();
        history.add(this.turnButton.getCommand());
    }

    public void beep() {
        this.beepButton.press();
        history.add(this.beepButton.getCommand());
    }

    public void replay() {
        for (Command command : history) {
            command.execute();
        }
    }

    public void restartRobot(Robot robot) {
        history.clear();
        this.robot = robot;
        setCommandsToButtons();
    }
}
