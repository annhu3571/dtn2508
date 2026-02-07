package com.vti.dtn2508.bt10;

public class NgayThangNam {
    public int ngay, thang, nam;

    public class GioPhutGiay {
        public int gio, phut, giay;
        public void inThongTin() {
            System.out.println("Ngay: "+ ngay + "/" + thang +"/" + nam);
            System.out.println("Gio: "+ gio + ":" + phut + ":" + giay);
        }
    }
}
