package ru.job4j.my.abstractfactory.banking;

import ru.job4j.my.abstractfactory.Developer;
import ru.job4j.my.abstractfactory.ProjectManager;
import ru.job4j.my.abstractfactory.ProjectTeamFactory;
import ru.job4j.my.abstractfactory.Tester;
import ru.job4j.my.abstractfactory.website.ManualTester;
import ru.job4j.my.abstractfactory.website.PhpDeveloper;
import ru.job4j.my.abstractfactory.website.WebsitePM;

public class WebSiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }
}
