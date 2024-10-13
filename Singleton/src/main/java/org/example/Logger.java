package org.example;

import java.util.ArrayList;
import java.util.List;

public class Logger {

    private static Logger logger;
    private List<String> logList;

    // Приватний конструктор, щоб уникнути створення об'єктів ззовні класу
    private Logger()
    {
        logList = new ArrayList<>();
    }

    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }

    // Метод для запису повідомлень логування
    public void log(String message) {
        logList.add(message);
        System.out.println("Log: " + message);
    }

    public void printLogs()
    {
        for (String log :logList)
        {
            System.out.println(log);
        }
    }

    public int getMessageCnt()
    {
        return logList.size();
    }

}
