package com.vti.springcourse.service;

import com.vti.springcourse.dto.request.DepartmentRequest;

import java.sql.SQLException;

public interface IDepartmentService {

    boolean isDepartmentNameExists(String name) throws SQLException ;

    void createDepartment(DepartmentRequest departmentRequest) throws Exception;
}
