package app;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {
        try {
            Class<?> clas = Class.forName("app.ArrayUtils");

            // Отримання всіх методів класу
            Method[] methods = clas.getDeclaredMethods();
            System.out.println("Методи класу " + clas.getName() + ":");
            for (Method method : methods) {
                System.out.println("\t" + method.getName());
                Annotation[] annotations = method.getDeclaredAnnotations();
                System.out.println(" \t\tАнотації методу: " + method.getName());
                for (Annotation annotation : annotations)
                {
                    System.out.println("\t\t\t" +  annotation);
                }
            }
        } catch ( ClassNotFoundException exception) {
            throw new RuntimeException(exception);
        }
    }
}
