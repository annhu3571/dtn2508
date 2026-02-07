package com.vti.dtn2508.bt10;

import com.vti.dtn2508.entity.Cpu;

public class Main {

    public static void main(String[] args) {
        ex2Bai4();
    }

    private void ex2Bai2() {
        Car car = new Car("Mazda", "8WD");
        Car.Engine engine = car.new Engine();
        engine.setEngineType("Crysler");
    }

    private static void ex2Bai3() {
        OuterClass outerClass = new OuterClass();
        outerClass.show();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.show();
    }


    private static void ex2Bai4() {
        NgayThangNam ngayThangNam = new NgayThangNam();
        ngayThangNam.ngay = 17;
        ngayThangNam.thang = 1;
        ngayThangNam.nam = 2026;

        NgayThangNam.GioPhutGiay gioPhutGiay = ngayThangNam.new GioPhutGiay();
        gioPhutGiay.gio = 19;
        gioPhutGiay.phut = 40;
        gioPhutGiay.giay = 00;
        gioPhutGiay.inThongTin();

    }
}
