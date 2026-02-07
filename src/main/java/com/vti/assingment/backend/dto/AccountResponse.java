package com.vti.assingment.backend.dto;

import com.vti.assingment.database.entity.Department;
import com.vti.assingment.database.entity.Gender;
import com.vti.assingment.database.entity.Group;

import java.util.Date;

public class AccountResponse {

    private int id;
    private Department department;
    private Group[] groups;
    private Date createDate;
    private Gender gender;
    private boolean isPassExam;

    public AccountResponse() {
    }

    public AccountResponse(int id, Department department, Group[] groups, Date createDate, Gender gender, boolean isPassExam) {
        this.id = id;
        this.department = department;
        this.groups = groups;
        this.createDate = createDate;
        this.gender = gender;
        this.isPassExam = isPassExam;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Group[] getGroups() {
        return groups;
    }

    public void setGroups(Group[] groups) {
        this.groups = groups;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public boolean isPassExam() {
        return isPassExam;
    }

    public void setPassExam(boolean passExam) {
        isPassExam = passExam;
    }
}
