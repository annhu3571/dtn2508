package com.vti.dtn2508.entity;

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
