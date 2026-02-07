package com.vti.springcourse.service;

import com.vti.springcourse.dto.request.DepartmentRequest;
import com.vti.springcourse.repository.IDepartmentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;

@Service
public class DepartmentService implements IDepartmentService {
    @Autowired
    private IDepartmentDao departmentDao;

    @Override
    public void createDepartment(DepartmentRequest departmentRequest) throws Exception {
        if (departmentDao.isDepartmentNameExists(departmentRequest.getName())) {
            throw new Exception("Department Name is Exists!");
        } else {
            departmentDao.createDepartment(departmentRequest);
        }
    }

    @Override
    public boolean isDepartmentNameExists(String name) throws SQLException {
        return departmentDao.isDepartmentNameExists(name);
    }
}