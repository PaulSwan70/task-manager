package ru.lebedev.tm;

import ru.lebedev.tm.controller.ProjectController;
import ru.lebedev.tm.controller.SystemController;
import ru.lebedev.tm.controller.TaskController;
import ru.lebedev.tm.repository.ProjectRepository;
import ru.lebedev.tm.repository.TaskRepository;
import ru.lebedev.tm.service.ProjectService;
import ru.lebedev.tm.service.TaskService;

import java.util.Scanner;

import static ru.lebedev.tm.constant.TerminalConst.*;

/**
 * Тестовое приложение
 */
public class App {

    private final ProjectRepository projectRepository = new ProjectRepository();

    private final TaskRepository taskRepository = new TaskRepository();

    private final ProjectService projectService = new ProjectService(projectRepository);

    private final TaskService taskService = new TaskService(taskRepository);

    private final ProjectController projectController = new ProjectController(projectService);

    private final TaskController taskController = new TaskController(taskService);

    private final SystemController systemController = new SystemController();

    {
        projectService.create("DP 1", "DEMO PROJECT 1");
        projectService.create("DP 2", "DEMO PROJECT 2");
        taskService.create("TEST 1", "TEST TASK 1");
        taskService.create("TEST 2", "TEST TASK 2");
    }

    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final App app = new App();
        app.run(args);
        app.systemController.displayWelcome();
        String command = "";
        while (!EXIT.equals(command)) {
            command = scanner.nextLine();
            app.run(command);
        }
    }

    public void run(final String[] args) {
        if (args == null) return;
        if (args.length < 1) return;
        final String param = args[0];
        final int result = run(param);
        System.exit(result);
    }

    public int run(final String param) {
        if (param == null || param.isEmpty()) return -1;
        switch (param) {
            case VERSION: return systemController.displayVersion();
            case ABOUT: return systemController.displayAbout();
            case HELP: return systemController.displayHelp();
            case EXIT: return systemController.displayExit();

            case PROJECT_CREATE: return projectController.createProject();
            case PROJECT_CLEAR: return projectController.clearProject();
            case PROJECT_LIST: return projectController.listProject();
            case PROJECT_VIEW: return projectController.viewProjectByIndex();
            case PROJECT_REMOVE_BY_NAME: return projectController.removeProjectByName();
            case PROJECT_REMOVE_BY_ID: return projectController.removeProjectById();
            case PROJECT_REMOVE_BY_INDEX: return projectController.removeProjectByIndex();
            case PROJECT_UPDATE_BY_INDEX: return projectController.updateProjectByIndex();


            case TASK_CREATE: return taskController.createTask();
            case TASK_CLEAR: return taskController.clearTask();
            case TASK_LIST: return taskController.listTask();
            case TASK_VIEW: return taskController.viewTaskByIndex();
            case TASK_REMOVE_BY_NAME: return taskController.removeTaskByName();
            case TASK_REMOVE_BY_ID: return taskController.removeTaskById();
            case TASK_REMOVE_BY_INDEX: return taskController.removeTaskByIndex();
            case TASK_UPDATE_BY_INDEX: return taskController.updateTaskByIndex();

            default: return systemController.displayError();
        }
    }

 }
