package br.com.dio.labcommandpattern.client;

import br.com.dio.labcommandpattern.model.Robot;
import br.com.dio.labcommandpattern.receiver.RobotControllerRemote;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot("Bob");
        RobotControllerRemote robotControllerRemote = new RobotControllerRemote(robot);

        String robotName = robot.getName();
        robotControllerRemote.move();
        robotControllerRemote.turn();
        robotControllerRemote.beep();

        System.out.println("Replay:");
        robotControllerRemote.replay();

        System.out.println("Change the robot:");
        robotControllerRemote.restartRobot(new Robot("Frank"));
        robotControllerRemote.move();
        robotControllerRemote.turn();
        robotControllerRemote.beep();
    }
}
