package com.vti.springcourse.service;

import com.vti.springcourse.entity.GroupAccount;
import com.vti.springcourse.repository.GroupAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupAccountService {

    @Autowired
    private GroupAccountRepository groupAccountRepository;


    public List<GroupAccount> getAll() {
        return groupAccountRepository.findAll();
    }
}
