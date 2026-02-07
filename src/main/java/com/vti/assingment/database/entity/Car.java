package com.vti.assingment.database.entity;

public class Car extends Vehicle {

    public String hangXe;

    public Car(String hangXe) {
        this.hangXe = hangXe;
    }

    @Override
    public void napNhienLieu() {
        System.out.println("Car nap nhien lieu");
    }

    @Override
    public String toString() {
        return "Car{" +
                "hangXe='" + hangXe + '\'' +
                '}';
    }
}
