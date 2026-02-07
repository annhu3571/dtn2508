package com.vti.springcourse.service;

import com.vti.springcourse.dto.response.AccountResponse;
import com.vti.springcourse.entity.Account;
import com.vti.springcourse.mapper.AccountMapper;
import com.vti.springcourse.repository.AccountRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public Page<AccountResponse> getListAccount(Pageable pageable) {
        return AccountMapper.map(accountRepository.findAll(pageable));
    }

    public List<Account> getListAccountByFullName(String fullName) {
        return accountRepository.findByFullName(fullName);
    }


    public Account getAccountById(int id) {
        return accountRepository.getAccountByIdV2(id);
    }

    @Transactional
    public void deleteAccount(int id) {
        accountRepository.deleteAccount(id);
    }

    @Transactional
    public void insertAccount(Account account ) {
        Account newAccount = accountRepository.save(account);
    }
}
