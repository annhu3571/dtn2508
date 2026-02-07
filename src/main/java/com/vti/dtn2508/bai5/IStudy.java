package com.vti.dtn2508.bai5;

public interface IStudy extends ICode {
    // thuoc tinh
    int diemTran = 10;
    int diemSan = 0;
    int diem = 0;
    // phuong thuc
    void doHomeWork();

    default void danhGiaHocLuc() {
        if(diem < 5) {
            System.out.println("Trung Binh");
        } else if(5 <= diem  && diem <=7) {
            System.out.println("Kha");
        } else {
            System.out.println("Gioi");
        }
    }
}
