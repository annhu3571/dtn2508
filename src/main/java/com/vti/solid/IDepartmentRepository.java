package com.vti.solid;

import com.vti.assingment.database.entity.Department;

import java.util.List;

public interface IDepartmentRepository {
    List<Department> getListDepartment();
}
