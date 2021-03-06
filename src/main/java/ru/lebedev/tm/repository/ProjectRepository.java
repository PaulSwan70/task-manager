package ru.lebedev.tm.repository;

import ru.lebedev.tm.entity.Project;

import java.util.ArrayList;
import java.util.List;

public class ProjectRepository {

    public List<Project> projects = new ArrayList<>();

    public Project create(final String name) {
        final Project project = new Project(name);
        projects.add(project);
        return project;
    }

    public Project create(final String name, final String description) {
        final Project project = new Project();
        project.setName(name);
        project.setDescription(description);
        projects.add(project);
        return project;
    }

    public Project update(final Long id, final String name, final String description) {
        final Project project = findById(id);
        if (project == null) return null;
        project.setId(id);
        project.setName(name);
        project.setDescription(description);
        return project;

    }

    public void clear() {
        projects.clear();
    }

    public Project findByIndex(final int index) {
        return projects.get(index);
    }

    public List<Project> findAll() {
        return projects;
    }

    public Project findByName(final String name) {
        for (final Project project: projects) {
            if(project.getName().equals(name)) return project;
        }
        return null;

    }

    public Project findById(final Long id) {
       for (final Project project: projects) {
            if(project.getId().equals(id)) return project;
        }
        return null;

    }

    public Project removeByIndex(final int index) {
        final Project project = findByIndex(index);
        if (project == null) return null;
        projects.remove(project);
        return project;

    }

    public Project removeById(final Long id) {
        final Project project = findById(id);
        if (project == null) return null;
        projects.remove(project);
        return project;

    }

    public Project removeByName(final String name) {
        final Project project = findByName(name);
        if (project == null) return null;
        projects.remove(project);
        return project;

    }

    public static void main(String[] args) {
        final ProjectRepository projectRepository = new ProjectRepository();
        projectRepository.create("DEMO");
        projectRepository.create("TEST");
        System.out.println(projectRepository.findAll());
        System.out.println(projectRepository);
        projectRepository.clear();
        System.out.println(projectRepository);
    }

}
