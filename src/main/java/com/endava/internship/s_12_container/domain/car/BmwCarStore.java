package com.endava.internship.s_12_container.domain.car;

public class BmwCarStore implements CarStore {

    @Override
    public Car sellCar(String color) {
        return CarFactory.produceCar("BMW", "F5", color);
    }
}
