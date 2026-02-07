package com.vti.assingment.database.entity;

import com.vti.dtn2508.bai5.IStudy;

public class Employee extends User implements IStudy {
    public  Employee(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double calculatePay() {
        return salary * 420;
    }

    @Override
    public double setSalary(double salary) {
        return salary * 420;
    }

    @Override
    public void doHomeWork() {
        System.out.println("Employee do home work");
    }

    @Override
    public void danhGiaHocLuc() {
        System.out.println("Employee Danh gia hoc luc");
    }

    @Override
    public void test() {

    }
}