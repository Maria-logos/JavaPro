package org.example;

public class StringListProcessor {
    public static int countUppercase(String s)
    {
        if (s == null) {
            throw new IllegalArgumentException("Input string is null");
        }
        return (int)s.chars().filter(Character::isUpperCase).count();
    }
}
