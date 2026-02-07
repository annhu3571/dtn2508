package com.vti.dtn2508.ex5;

public class HinhChuNhat {

    protected double chieuDai;
    protected double chieuRong;

    public HinhChuNhat(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public double tinhChuVi() {
        if(this instanceof HinhVuong) {
            System.out.println("Tính chu vi theo Hình Vuông");
        } else {
            System.out.println("Tính chu vi theo Hình Chữ Nhật");
        }
        return 2 * (chieuDai + chieuRong);
    }
}
