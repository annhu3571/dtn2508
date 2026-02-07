package com.vti.assingment.database.entity;

 abstract class Vehicle extends Object{
    private String dongCo;

    public void di() {
        // nap nhien lieu
        napNhienLieu();
        // khoi dong
        khoiDong();
        // chay
        chay();
    }

    public abstract void napNhienLieu();

    public void khoiDong() {
        System.out.println("Cac xe khoi dong giong nhau");
    }

    public void chay() {
        System.out.println("Cac xe deu chay giong nhau");
    }


 }
