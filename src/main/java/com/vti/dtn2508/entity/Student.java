package com.vti.dtn2508.entity;

import com.vti.dtn2508.bai5.IStudy;

import java.util.Objects;

public class Student implements IStudy {

    int studentID;
    boolean isPassExam;
    String studentName;
    public static int studentCount = 0;
    public String getName() {
        return this.studentName;
    }

    public Student() {
        studentCount += 1;
    }

    @Override
    public void doHomeWork() {
        System.out.println("Student do home work");
    }

    @Override
    public void test() {

    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(studentName, student.studentName);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(studentName) + Objects.hashCode(studentID);
    }
}
