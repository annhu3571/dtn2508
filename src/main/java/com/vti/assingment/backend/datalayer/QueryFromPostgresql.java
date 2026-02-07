package com.vti.assingment.backend.datalayer;

import com.vti.assingment.database.entity.Account;

import java.util.ArrayList;
import java.util.List;

public class QueryFromPostgresql implements  QueryFromDB {

    public List<Account> getAccounts() {
        List<Account> accounts = new ArrayList<>();
        // coneect to postgresql
        // query syntax postgresql
        return accounts;
    }
}
