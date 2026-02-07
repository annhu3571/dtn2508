package com.vti.assingment.database.entity;

import com.vti.dtn2508.exception.InvalidAgeInputingException;
import com.vti.dtn2508.util.ScannerUtils;

import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

public class  Account extends Object{

    public int id;
    protected  String email;
    protected Department department;
    private Group[] groups;
    Date createDate;
    Gender gender;
    boolean isPassExam;
    transient int  age;

    public boolean isPassExam() {
        return isPassExam;
    }

    public void setPassExam(boolean passExam) {
        isPassExam = passExam;
    }

    public static Scanner getSc() {
        return sc;
    }

    public static void setSc(Scanner sc) {
        Account.sc = sc;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setGroups(Group[] groups) {
        this.groups = groups;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(age);
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    static Scanner sc = new Scanner(System.in);

    public Department getDepartment() {
        return this.department;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Group[] getGroups() {
        return  this.groups;
    }
//    public Account(int id, String email) {
//        super();
//        this.id = id;
//        this.email = email;
//        System.out.println(this);
//    }

    public Account(int id, String email, Gender gender) {
        this.id = id;
        this.email = email;
        this.gender = gender;
    }


    public Account() {
//        inputAccountAge();
    }

    public Account(int age, String email) {
//        inputAccountAge();
        this.age = age;
        this.email = email;
    }



    public void inputAge(int age) {
        if(age <=0) {
            throw new InvalidAgeInputingException(
                    "The age must be greater than 0"
            );
        }

        if(age < 18)  {
            throw new InvalidAgeInputingException(
                    "TYour age must be greater than 18"
            );
        }
        this.age = age;
    }

    public void inputAccountAge() {
        while (true) {
            System.out.println("Vui long nhap tuoi");
            int age = ScannerUtils.inputInt("Error number");
            try {
                inputAge(age);
                break;
            } catch (InvalidAgeInputingException e) {
                System.out.println(e.getMessage());
            }
        }
    }

//    public void inputAge2() {
//        while (true) {
//            try {
//                System.out.print("Input age: ");
//                int inputAge = Integer.parseInt(sc.nextLine());
//
//                if (inputAge <= 0) {
//                    throw new InvalidAgeInputingException(
//                            "The age must be greater than 0"
//                    );
//                }
//
//                this.age = inputAge;
//                break;
//
//            } catch (InvalidAgeInputingException | NumberFormatException e) {
//                System.out.println(e.getMessage());
//            }
//        }
//    }
}
