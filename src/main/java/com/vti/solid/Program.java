package com.vti.solid;

public class Program {

    public static void main(String[] args) {
        DIContainer diContainer = new DIContainer();
        DepartmentController departmentController = diContainer.initDepartmentController();
        departmentController.getListDepartment();
    }
}
