package com.vti.dtn2508.bt09;

import java.util.*;
@SuppressWarnings("deprecation")
public class Collection {
    private static ArrayList<Student> students = new ArrayList<>();


    public static void main(String[] args) {

        Date date = new Date(120, 4, 18);

        Date date2 = new Date(120, 4, 18);

    }

    private void test2 () {
        Date date2 = new Date(120, 4, 18);
    }

    private void test() {
        findStudentById(1);
    }


    /**
     * @Deprecated ham nay se khong dc dung nua
     * @param id
     * @return
     */
    @Deprecated(since="9", forRemoval = true)
    private Student findStudentById(int id) {
        for(Student student: students) {
            if(student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    private List<Student> findStudentByName(String name) {
        ArrayList<Student> studentsResult = new ArrayList<>();
        for(Student student: students) {
            if(Objects.equals(student.getName(), name)) {
                studentsResult.add(student);
            }
        }
        return studentsResult;
    }

    private void printfStudentWithSameName() {
        for (Student student: students) {
            for (Student student1 : students) {
                if(Objects.equals(student.getName(), student1.getName())) {
                    System.out.println(student);
                }
            }
        }
    }
}
