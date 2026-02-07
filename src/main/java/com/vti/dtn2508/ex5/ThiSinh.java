package com.vti.dtn2508.ex5;

public class ThiSinh {
    private int id;
    private String name;
    private String address;
    private int level;
    private Khoi khoi;


    public ThiSinh(int id, String name, String address, int level, Khoi khoi) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.level = level;
        this.khoi = khoi;
    }

    public ThiSinh() {

    }

    // Getter & Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "ThiSinh{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", level=" + level +
                '}';
    }
}