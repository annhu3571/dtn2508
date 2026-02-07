package com.vti.assingment.database.entity;

public class Main {
    public static void main(String[] args) {
        Cpu cpu = new Cpu(1500.0);

        Cpu.Processor processor = cpu.new Processor(8, "Intel");


        Cpu.Ram ram = cpu.new Ram(16, "Kingston");


        System.out.println("Processor cache: " + processor.getCache());
        System.out.println("Ram clock speed: " + ram.getClockSpeed());
    }

    public static void banXe(Vehicle vehicle) {
        // phai goi
        vehicle.di();
        vehicle.toString();
        if(vehicle instanceof Car) {
            Car car = (Car) vehicle;
            if(car.hangXe == "Huyndai") {
                System.out.println("Khong ban");
            }
        }
    }


}