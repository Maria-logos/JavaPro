package org.example;

import org.junit.jupiter.api.Test;

import java.util.function.Function;
import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainTest {

    @Test
    public void testUpperCounts() {
        Function<String, Integer> countUpper = StringListProcessor::countUppercase;
        assertEquals(2, countUpper.apply("JavaLesson"));
    }

    @Test
    public void tesSum() {
        MathOperation math = new MathOperation() {
            @Override
            public int operate(int a, int b) {
                return a + b;
            }
        };
        int res = math.operate(2, 4);
        assertEquals(6, res);
    }
    @Test
    public void testConvertToUpper() {
        StringManipulator strMan = String::toUpperCase;
        assertEquals("LESSON", strMan.convert("lesson"));
    }
    @Test
    public void testSupplier() {
        Supplier<Integer> randomIntegerSupplier = () -> (int)
                (RandomNumberGenerator.generateRandomNumber(1, 100));
       assertTrue(randomIntegerSupplier.get() > 1);
       assertTrue(randomIntegerSupplier.get() < 100);
        System.out.println(randomIntegerSupplier.get());
    }
}
