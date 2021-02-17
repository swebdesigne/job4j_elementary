package ru.job4j.my.abstractfactory.banking;

import ru.job4j.my.abstractfactory.ProjectManager;

public class BankingPm implements ProjectManager {
    @Override
    public void managerProject() {
        System.out.println("Banking PM manages banking project...");
    }
}
