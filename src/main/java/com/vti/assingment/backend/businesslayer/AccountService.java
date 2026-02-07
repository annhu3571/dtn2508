package com.vti.assingment.backend.businesslayer;

import com.vti.assingment.backend.datalayer.IAccountRepository;
import com.vti.assingment.backend.dto.AccountResponse;
import com.vti.assingment.backend.mapping.AccountMapping;
import com.vti.assingment.database.entity.Account;

import java.util.List;

public class AccountService implements IAccountService {

    private IAccountRepository accountRepository;

    public AccountService(IAccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public List<AccountResponse> getAccounts() {
        List<Account> accountList =  accountRepository.getListAccounts();
        return AccountMapping.map(accountList);
    }
}
