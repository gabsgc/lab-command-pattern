package br.com.dio.labcommandpattern.invoker;

import br.com.dio.labcommandpattern.commands.Command;

public interface IButton {
    void setCommand(Command command);
    Command getCommand();
    void press();
}
