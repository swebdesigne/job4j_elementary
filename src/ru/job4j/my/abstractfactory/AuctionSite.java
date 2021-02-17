package ru.job4j.my.abstractfactory;

import org.junit.Test;
import ru.job4j.my.abstractfactory.banking.WebSiteTeamFactory;

public class AuctionSite {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new WebSiteTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        System.out.println("Creating auction website...");
        developer.writeCode();
        tester.testCode();
        projectManager.managerProject();
    }
}
