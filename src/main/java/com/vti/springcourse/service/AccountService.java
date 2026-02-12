package com.vti.springcourse.service;

import com.vti.springcourse.dto.response.AccountResponse;
import com.vti.springcourse.entity.Account;
import com.vti.springcourse.entity.Department;
import com.vti.springcourse.mapper.AccountMapper;
import com.vti.springcourse.repository.AccountRepository;
import com.vti.springcourse.repository.specification.AccountSpecification;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;
    @Autowired
    private ModelMapper modelMapper;

    public Page<AccountResponse> getListAccount(String search, Pageable pageable) {

//        Specification<Account> specification = AccountSpecification.buildWhere(search);
        return AccountMapper.map(accountRepository.findByUserName(search, pageable));
    }



    public AccountResponse getAccountById(int id) {
        Account account = accountRepository.getAccountById(id);
        return modelMapper.map(account, AccountResponse.class);
    }

    @Transactional
    public void deleteAccount(int id) {
        accountRepository.deleteAccount(id);
    }

    @Transactional
    public void insertAccount(Account account ) {
        accountRepository.save(account);
    }
}
