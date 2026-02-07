package com.vti.dtn2508.ex5;

import java.util.ArrayList;

public class TuyenSinh implements ITuyenSinh{
    ArrayList<ThiSinh> danhSachTuyenSinh = new ArrayList<>();

    @Override
    public void themThiSinh(ThiSinh thiSinh) {
        danhSachTuyenSinh.add(thiSinh);
    }

    @Override
    public void display(ThiSinh thiSinh) {
        System.out.println(thiSinh);
    }

    @Override
    public void search(int sbd) {
        boolean found = false;
        for(ThiSinh thiSinh: danhSachTuyenSinh){
            if (sbd==thiSinh.getId()){
                System.out.println(thiSinh);
                found = true;
            }
        }if (found==false){
            System.out.println("Không tìm thấy thí sinh.");
        }
    }

    @Override
    public void exit() {
        System.out.println("Thoát chương trình.");
        System.exit(0);
    }
}