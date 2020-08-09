package ru.lebedev.tm.controller;

import ru.lebedev.tm.entity.Project;

public class SystemController {

    public int displayVersion() {
        System.out.println("1.0.9");
        return 0;

    }

    public int displayAbout() {
        System.out.println("Paul Lebedev");
        System.out.println("paul@lebedev.ru");
        return 0;

    }

    public int displayExit() {
        System.out.println("Terminate program...");
        return 0;
    }

    public int displayError() {
        System.out.println("Error! Unknown program argument...");
        return -1;
    }

    public void displayWelcome() {
        System.out.println("** WELCOME TASK MANAGER **");
    }

    public int displayHelp() {
        System.out.println("version - Display application version.");
        System.out.println("about - Display developer info.");
        System.out.println("help - Display list of commands.");
        System.out.println("exit - Terminate console application.");
        System.out.println();
        System.out.println("project-list - Display list of projects.");
        System.out.println("project-create - Create a new project by name.");
        System.out.println("project-clear - Remove all projects.");
        System.out.println("project-view - Display information about project.");
        System.out.println("project-remove-by-name - Remove a project by name.");
        System.out.println("project-remove-by-id - Remove a project by id.");
        System.out.println("project-remove-by-index - Remove a project by index.");
        System.out.println("project-update-by-index - Update a project by index.");
        System.out.println();
        System.out.println("task-list - Display list of tasks.");
        System.out.println("task-create - Create a new task by name.");
        System.out.println("task-clear - Remove all tasks.");
        System.out.println("task-view - Display information about task.");
        System.out.println("task-remove-by-name - Remove a task by name.");
        System.out.println("task-remove-by-id - Remove a task by id.");
        System.out.println("task-remove-by-index - Remove a task by index.");
        System.out.println("task-update-by-index - Update a task by index.");
        return 0;
    }

 }
