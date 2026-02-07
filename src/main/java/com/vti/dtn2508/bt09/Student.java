package com.vti.dtn2508.bt09;

import com.vti.dtn2508.entity.Account;

public class Student {

    private int id;
    private String name;

    public static int autoID = 1;

    public Student(String name) {
        this.id = autoID++;
        this.name = name;
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }



    @Override
    public boolean equals(Object obj) {
        if(obj instanceof  Student) {
            Student student = (Student) obj;
            return  this.id == student.getId();
        }
        return this == obj;
    }

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

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
