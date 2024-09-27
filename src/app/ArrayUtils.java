package app;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MethodInfo {
    String name();
    String type();
    String description();
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Author {
    String firstName();
    String lastName();
}

public class ArrayUtils {

    @Author(
            firstName = "Maria",
            lastName = "Siniukova")
    public void AddElement()
    {
        //some Realization
    }
    @MethodInfo(
        name = "GetElement",
        type = "String",
        description = "return first Element from the list")
    public String GetElement()
    {
        return "";
    }
}
