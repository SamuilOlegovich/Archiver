package com.sam.arch.command;

import com.sam.arch.ConsoleHelper;

public class ExitCommand implements Command {

    public void execute() throws Exception {
        ConsoleHelper.writeMessage("До встречи!");
    }
}
