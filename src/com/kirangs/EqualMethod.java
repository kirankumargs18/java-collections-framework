package com.kirangs;

import java.util.Objects;

public class EqualMethod {

    public static void main(String[] args) {

        Car car1 = new Car("Tesla", "Model S", 15);
        Car car2 = new Car("Tesla", "Model S", 15);

        System.out.println(car1.equals(car2));
    }
}

class Car {

    private String make;
    private String model;
    private int milage;

    public Car(String make, String model, int milage) {
        this.make = make;
        this.model = model;
        this.milage = milage;
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

    public int getMilage() {
        return milage;
    }

    public void setMilage(int milage) {
        this.milage = milage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        //we can skip milage comparison here, as milage changes everyday
        return Objects.equals(make, car.make) && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(make, model);
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", milage=" + milage +
                '}';
    }
}