package ru.lebedev.tm.dao;

import ru.lebedev.tm.entity.Project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProjectDAO {

    private List<Project> projects = new ArrayList<>();

    public Project create(final String name) {
        final Project project = new Project(name);
        projects.add(project);
        return project;
    }

    public void clear() {
        projects.clear();
    }

    public List<Project> findAll() {
        return projects;
    }

    public static void main(String[] args) {
        final ProjectDAO projectDAO = new ProjectDAO();
        projectDAO.create("DEMO");
        projectDAO.create("TEST");
        System.out.println(projectDAO.findAll());
        System.out.println(projectDAO);
        projectDAO.clear();
        System.out.println(projectDAO);
    }

}
