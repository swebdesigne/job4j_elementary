package ru.job4j.my.abstractfactory.website;

import ru.job4j.my.abstractfactory.ProjectManager;

public class WebsitePM implements ProjectManager {
    @Override
    public void managerProject() {
        System.out.println("Website PM manages website projects...");
    }
}
