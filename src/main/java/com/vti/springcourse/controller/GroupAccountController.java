package com.vti.springcourse.controller;


import com.vti.springcourse.entity.GroupAccount;
import com.vti.springcourse.service.GroupAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/group-account")
public class GroupAccountController {

    @Autowired
    private GroupAccountService groupAccountService;

    @GetMapping
    public List<GroupAccount> getAll() {
        return groupAccountService.getAll();
    }
}
