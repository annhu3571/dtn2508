package com.vti.dtn2508.bt11.service;

import com.vti.dtn2508.bt11.dao.DepartmentDao;
import com.vti.dtn2508.bt11.dao.IDepartmentDao;

import java.sql.Connection;
import java.sql.SQLException;

public class DepartmentService implements  IDepartmentService{
    private final IDepartmentDao departmentDao = new DepartmentDao();

    @Override
    public void createDepartment(String name, int id) throws Exception {
//        if (departmentDao.isDepartmentNameExists(name)) {
//            throw new Exception("Department Name is Exists!");
//        } else {
//            departmentDao.createDepartment(name, id);
//        }
    }
}