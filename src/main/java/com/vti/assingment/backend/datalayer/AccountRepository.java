package com.vti.assingment.backend.datalayer;

import com.vti.assingment.database.entity.Account;

import java.util.ArrayList;
import java.util.List;

public class AccountRepository implements IAccountRepository{
    private QueryFromDB mysql;

    public AccountRepository(QueryFromDB mysql) {
        this.mysql = mysql;
    }

    public List<Account> getListAccounts() {
        ArrayList<Account> accounts = new ArrayList<>();
        // connect db
        // query
        mysql.getAccounts();
        // mapping
        return accounts;
    }
}
