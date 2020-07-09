package ru.lebedev.tm;

import static ru.lebedev.tm.constant.TerminalConst.*;

/**
 * Тестовое приложение
 */
public class Main {


    public static void main(final String[] args) {
        run(args);
        displayWelcome();
    }

    private static void run(final String[] args) {
        if (args == null) return;
        if (args.length < 1) return;
        final String param = args[0];
        switch (param) {
            case VERSION: displayVersion();
            case ABOUT: displayAbout();
            case HELP: displayHelp();
            default: displayError();
        }

    }

    private static void displayError() {
        System.out.println("Error! Unknown program argument...");
        System.exit(-1);
    }

    private static void displayWelcome() {
        System.out.println("** WELCOME TASK MANAGER **");
    }

    private static void displayHelp(){
        System.out.println("version - Display application version");
        System.out.println("about - Display developer info");
        System.out.println("help - Display list of commands");
        System.exit(0);
    }

    private static void displayVersion(){
        System.out.println("1.0.0");
        System.exit(0);

    }

    private static void displayAbout(){
        System.out.println("Paul Lebedev");
        System.out.println("paul@lebedev.ru");
        System.exit(0);

    }
 }
