package com.vti.dtn2508.ex5;

public class Khoi {

    private MonHoc [] monHocs;

    public Khoi(MonHoc[] monHocs) {
        this.monHocs = monHocs;
    }


    public static Khoi taoKhoiA() {
        MonHoc toan = new MonHoc(1, "Toan");
        MonHoc li = new MonHoc(1, "Li");
        MonHoc hoa = new MonHoc(1, "Hoa");
        MonHoc [] monHocs = {toan, li, hoa};
        return new Khoi(monHocs);
    }

    public static Khoi taoKhoiB() {
        MonHoc toan = new MonHoc(1, "Toan");
        MonHoc li = new MonHoc(1, "Hoa");
        MonHoc hoa = new MonHoc(1, "Sinh");
        MonHoc [] monHocs = {toan, li, hoa};
        return new Khoi(monHocs);
    }

    public static Khoi taoKhoiC() {
        MonHoc toan = new MonHoc(1, "Van");
        MonHoc li = new MonHoc(1, "Su");
        MonHoc hoa = new MonHoc(1, "Dia");
        MonHoc [] monHocs = {toan, li, hoa};
        return new Khoi(monHocs);
    }
}
