package com.vti.springcourse.service;

import com.vti.springcourse.dto.request.DepartmentRequest;
import com.vti.springcourse.dto.response.DepartmentResponse;
import com.vti.springcourse.entity.Account;
import com.vti.springcourse.entity.Department;
import com.vti.springcourse.repository.DepartmentRepository;
import com.vti.springcourse.repository.IDepartmentDao;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class DepartmentService implements IDepartmentService {
    @Autowired
    private IDepartmentDao departmentDao;
    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private ModelMapper modelMapper;

    public DepartmentResponse getDepartmentDetail(int id) {
        Department department = departmentRepository.getReferenceById(id);
        List<Account> accounts = getAccount(department);
        return modelMapper.map(department, DepartmentResponse.class);
    }

    private List<Account> getAccount(Department department) {
        return department.getAccounts();
    }

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