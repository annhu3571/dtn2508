package com.vti.assingment.database.entity;

public abstract class User {
    String name;
    double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public abstract double calculatePay();

    public abstract double setSalary(double salary);

    public User(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }


    public void displayInfo() {
        // các bước cụ thể
        // lấy ra tên (tất cả giống nhau)
        // lất ra hệ số lương (tất cả đều giống nhau)
        // tính lương(mỗi loại user thì tính lương khác nhau)
        // => dùng template desgin parttern
        // và các bước không cụ thể (trừu tượng)
        System.out.println(
                "Tên: " + name +
                        ", Hệ số lương: " + salary +
                        ", Thu nhập: " + calculatePay()
        );
    }
}
