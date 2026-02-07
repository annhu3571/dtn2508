package com.vti.dtn2508.entity;

public class Department implements Comparable<Department> {
    int id;
    String name;

    public Department(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    // Override toString()
    @Override
    public String toString() {
        return "Department{id=" + id + ", name='" + name + "'}";
    }

    // Override equals(): bằng nhau khi name bằng nhau
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Department that = (Department) obj;
        return this.name.equals(that.name);
    }

    // Sort theo tên (ABC)
    @Override
    public int compareTo(Department o) {
        return o.name.compareToIgnoreCase(this.name);
    }
}