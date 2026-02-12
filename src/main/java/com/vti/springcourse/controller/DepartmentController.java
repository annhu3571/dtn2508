package com.vti.springcourse.controller;

import com.vti.springcourse.dto.request.DepartmentRequest;
import com.vti.springcourse.dto.response.DepartmentResponse;
import com.vti.springcourse.entity.Department;
import com.vti.springcourse.service.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;

@RestController
@RequestMapping(value = "api/v1/departments")
public class DepartmentController {

    @Autowired
    private IDepartmentService departmentService;

    @GetMapping(value = "/{id}")
    public DepartmentResponse getDepartmentDetail(@PathVariable int id) throws SQLException {
        return departmentService.getDepartmentDetail(id);
    }

    @GetMapping(value = "/exits")
    public boolean checkExitsDepartment(@RequestParam String name) throws SQLException {
        return departmentService.isDepartmentNameExists(name);
    }

    @PostMapping
    public String createDepartment(@RequestBody DepartmentRequest departmentRequest) {
        try {
            departmentService.createDepartment(departmentRequest);
            return "Create success";
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
