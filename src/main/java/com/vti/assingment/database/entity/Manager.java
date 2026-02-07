package com.vti.assingment.database.entity;

public class Manager extends User {

    public Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double calculatePay() {
        return salary * 520;
    }

    @Override
    public double setSalary(double salary) {
        return 0;
    }
}
