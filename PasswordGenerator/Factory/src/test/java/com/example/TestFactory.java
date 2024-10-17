package com.example;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TestFactory {
    @Test
    public void Test()
    {
        CarFactory carFactory = new CarFactory();
        Transport car = carFactory.createTransport();

        PlaneFactory planeFactory = new PlaneFactory();
        Transport plane = planeFactory.createTransport();

        Assertions.assertEquals("com.example.Car", car.getClass().getName());
        Assertions.assertEquals("com.example.Plane", plane.getClass().getName());
    }
}
