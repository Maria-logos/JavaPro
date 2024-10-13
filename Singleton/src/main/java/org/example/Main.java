package org.example;

public class Main {
    public static void main(String[] args) {

        Logger logger1 = Logger.getInstance();
        logger1.log("First message in logs");

        System.out.println("\n");

        Logger logger2 = Logger.getInstance();
        logger2.log ("Second message in logs");
        logger2.log ("Third message in logs");

        System.out.println(logger2.equals(logger1));
        logger1.printLogs();

        }
    }