package com.vti.solid;

import com.vti.assingment.database.entity.Department;

import java.util.ArrayList;
import java.util.List;

public class DepartmentRepository implements IDepartmentRepository {


    public List<Department> getListDepartment() {
        return new ArrayList<>();
    }
}
