package ru.job4j.my.singleton;

import ru.job4j.my.factory2.ProgramLogger;

public class ProgramRunner {
    public static void main(String[] args) {
        ProgramLogger.getProgramLogger().addLogInfo("First lo...");
        ProgramLogger.getProgramLogger().addLogInfo("Second lo...");
        ProgramLogger.getProgramLogger().addLogInfo("Third lo...");

        ProgramLogger.getProgramLogger().showLogFile();
    }
}
