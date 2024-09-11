package org.example;


import java.util.function.Function;
import java.util.function.Supplier;

interface StringManipulator {
    String convert (String a);
}

public class Main {

    public static void main(String[] args) {
        MathOperation math = new MathOperation() {
            @Override
            public int operate(int a, int b) {
                return a + b;
            }
        };
        int res = math.operate(2, 4);
        System.out.println("Anonimous class sum = " + res);

        StringManipulator strMan = String::toUpperCase;
        System.out.println("Convert to Upper " + strMan.convert("lesson"));
        Function<String, Integer> countUpper = StringListProcessor::countUppercase;
        System.out.println("Upper counts " + countUpper.apply("JavaLesson"));

        Supplier<Integer> randomIntegerSupplier = () -> (int)
                (RandomNumberGenerator.generateRandomNumber(1, 100));
        System.out.println(randomIntegerSupplier.get());
    }
}