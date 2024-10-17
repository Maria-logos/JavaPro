package com.example;

public class Car implements Transport{
    @Override
    public void move() {
        System.out.println("Speed is 70 km");
    }
}
