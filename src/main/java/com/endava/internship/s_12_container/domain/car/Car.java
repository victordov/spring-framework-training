package com.endava.internship.s_12_container.domain.car;

import java.util.Objects;

public class Car {

    private String make;
    private String model;
    private Gearbox gearbox;
    private String color;
    private Integer price;


    public Car() {
    }

    public Car(String make, String model, Gearbox gearbox, String color, Integer price) {
        this.make = make;
        this.model = model;
        this.gearbox = gearbox;
        this.color = color;
        this.price = price;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Gearbox getGearbox() {
        return gearbox;
    }

    public void setGearbox(Gearbox gearbox) {
        this.gearbox = gearbox;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Car car = (Car) o;
        return make.equals(car.make) &&
            model.equals(car.model) &&
            gearbox == car.gearbox &&
            Objects.equals(color, car.color) &&
            Objects.equals(price, car.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(make, model, gearbox, color, price);
    }

    @Override
    public String toString() {
        return "Car{" +
            "make='" + make + '\'' +
            ", model='" + model + '\'' +
            ", gearbox=" + gearbox +
            ", color='" + color + '\'' +
            ", price=" + price +
            '}';
    }
}
