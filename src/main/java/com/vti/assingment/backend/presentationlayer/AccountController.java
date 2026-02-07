package com.vti.assingment.backend.presentationlayer;

import com.vti.assingment.backend.businesslayer.AccountService;
import com.vti.assingment.backend.dto.AccountResponse;
import com.vti.assingment.backend.validation.AccountValidation;
import com.vti.assingment.database.entity.Account;

import java.util.List;

public class AccountController {
    private AccountValidation accountValidation;
    private AccountService accountService;

    public AccountController(AccountService accountService, AccountValidation accountValidation) {
        this.accountService = accountService;
        this.accountValidation = accountValidation;
    }

    public List<AccountResponse> getAccounts() {
        try {
            // validate
            accountValidation.validateUser();
            // handle ex
            return accountService.getAccounts();
        } catch (Exception e) {
            throw  new RuntimeException(e.getMessage());
        }
    }
}
