package com.vti.dtn2508.bt11.dao;

import com.vti.springcourse.dto.request.DepartmentRequest;

import java.sql.SQLException;

public interface IDepartmentDao {

    boolean isDepartmentNameExists(String name) throws SQLException ;

    void createDepartment(DepartmentRequest departmentRequest) throws Exception;
}
