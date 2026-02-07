package com.vti.solid;

public class DIContainer {

    public IDepartmentRepository initDepartmentRepo() {
        return new DepartmentRepository();
    }


    public IDepartmentService initDepartmentService() {
        return new DepartmentService(initDepartmentRepo());
    }

    public DepartmentController initDepartmentController() {
        return new DepartmentController(initDepartmentService());
    }
}
