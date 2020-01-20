package com.sam.arch.command;


import com.sam.arch.ConsoleHelper;
import com.sam.arch.FileProperties;
import com.sam.arch.ZipFileManager;

import java.util.List;

public class ZipContentCommand extends ZipCommand {
    @Override
    public void execute() throws Exception {
        ConsoleHelper.writeMessage("Просмотр содержимого архива.");

        ZipFileManager zipFileManager = getZipFileManager();

        ConsoleHelper.writeMessage("Содержимое архива:");

        List<FileProperties> files = zipFileManager.getFilesList();

        for (FileProperties file : files) { ConsoleHelper.writeMessage(file.toString()); }

        ConsoleHelper.writeMessage("Содержимое архива прочитано.");
    }
}
