package com.example;

public class Client {
    public static void run()
    {
        CarFactory carFactory = new CarFactory();
        Transport car = carFactory.createTransport();
        car.move();

        PlaneFactory planeFactory = new PlaneFactory();
        Transport plane = planeFactory.createTransport();
        plane.move();
    }
}
