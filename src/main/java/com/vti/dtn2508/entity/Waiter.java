package com.vti.dtn2508.entity;

public class Waiter extends User {
    public Waiter(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double calculatePay() {
        return salary * 220;
    }

    @Override
    public double setSalary(double salary) {
        return 0;
    }

}