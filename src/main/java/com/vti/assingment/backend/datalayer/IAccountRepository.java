package com.vti.assingment.backend.datalayer;

import com.vti.assingment.database.entity.Account;

import java.util.List;

public interface IAccountRepository {
    public List<Account> getListAccounts();
}
