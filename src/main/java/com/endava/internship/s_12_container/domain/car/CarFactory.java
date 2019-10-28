package com.endava.internship.s_12_container.domain.car;

public class CarFactory {

    public static Car produceCar(String make, String model, String color) {
        return new Car(make, model, Gearbox.AUTOMATIC, color, 99_999);
    }
}
