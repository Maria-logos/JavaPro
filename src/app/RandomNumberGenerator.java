package app;

import java.util.random.RandomGenerator;


public class RandomNumberGenerator {
    public static Integer generateRandomNumber(int min, int max)
    {
        if (min > max) {
            throw new IllegalArgumentException("Min cannot be greater than Max");
        }
        return RandomGenerator.getDefault().nextInt(min, max + 1);
    }
}
