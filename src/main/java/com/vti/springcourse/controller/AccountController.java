package com.vti.springcourse.controller;

import com.vti.springcourse.dto.response.AccountResponse;
import com.vti.springcourse.entity.Account;
import com.vti.springcourse.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/v1")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping(value = "/accounts")
    public Page<AccountResponse> getAccounts(Pageable pageable) {
        return accountService.getListAccount(pageable);
    }


    @GetMapping(value = "/accounts/{id}")
    public Account getAccounts(@PathVariable int id) {
        return accountService.getAccountById(id);
    }

    @DeleteMapping(value = "/accounts/{id}")
    public void deleteAccount(@PathVariable int id) {
        accountService.deleteAccount(id);
    }

    @PostMapping(value = "/accounts")
    public void createAccount(@RequestBody Account account) {
        accountService.insertAccount(account);
    }
}
