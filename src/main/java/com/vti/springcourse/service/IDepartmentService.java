package com.vti.springcourse.service;

import com.vti.springcourse.dto.request.DepartmentRequest;
import com.vti.springcourse.dto.response.DepartmentResponse;
import com.vti.springcourse.entity.Department;

import java.sql.SQLException;

public interface IDepartmentService {

    boolean isDepartmentNameExists(String name) throws SQLException ;
    DepartmentResponse getDepartmentDetail(int id) ;

    void createDepartment(DepartmentRequest departmentRequest) throws Exception;
}
