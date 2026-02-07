package com.vti.solid;

import com.vti.assingment.database.entity.Department;

import java.util.List;

public class DepartmentController {

    private IDepartmentService departmentService;

    public DepartmentController(IDepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    public List<Department> getListDepartment() {
        return departmentService.getListDepartment();
    }
}
