package com.vti.solid;

import com.vti.assingment.database.entity.Department;

import java.util.ArrayList;
import java.util.List;

public class DepartmentService implements IDepartmentService{
    private IDepartmentRepository departmentRepository;

    public DepartmentService(IDepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    public List<Department> getListDepartment() {
        return departmentRepository.getListDepartment();
    }
}
