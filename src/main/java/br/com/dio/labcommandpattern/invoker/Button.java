package br.com.dio.labcommandpattern.invoker;

import br.com.dio.labcommandpattern.commands.Command;

public class Button implements IButton {
    private Command command;

    public Button(Command command) {
        this.command = command;
    }

    @Override
    public void setCommand(Command command) {
        this.command = command;
    }

    public Command getCommand() {
        return command;
    }

    @Override
    public void press() {
        command.execute();
    }
}
