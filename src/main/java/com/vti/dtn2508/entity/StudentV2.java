package com.vti.dtn2508.entity;

public class StudentV2 {

    // Q2: id là final, không thể thay đổi sau khi khởi tạo
    private final int id;
    private String name;

    public StudentV2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // Q3: Final method - không thể bị Override bởi class con
    public final void study() {
        System.out.println("Đang học bài...");
    }
}
