package com.vti.dtn2508.bt11.controller;

import com.vti.dtn2508.bt11.service.DepartmentService;
import com.vti.dtn2508.bt11.service.IDepartmentService;

public class DepartmentController {

    private  static final IDepartmentService departmentService = new DepartmentService();

    public static void main(String[] args) throws Exception {
        departmentService.createDepartment("New department", 10);
    }
}
