package ru.job4j.my.abstractfactory.banking;

import ru.job4j.my.abstractfactory.Developer;
import ru.job4j.my.abstractfactory.ProjectManager;
import ru.job4j.my.abstractfactory.ProjectTeamFactory;
import ru.job4j.my.abstractfactory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QSTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPm();
    }
}
