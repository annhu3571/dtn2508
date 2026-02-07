package com.vti.assingment.backend.mapping;

import com.vti.assingment.backend.dto.AccountResponse;
import com.vti.assingment.database.entity.Account;

import java.util.ArrayList;
import java.util.List;

public class AccountMapping {

    public static List<AccountResponse> map(List<Account> accountList) {

        List<AccountResponse> accountResponses = new ArrayList<>();
        for(Account account: accountList) {
            // map tu account -> account response
            AccountResponse accountResponse = new AccountResponse();
            accountResponse.setId(account.id);
            accountResponse.setPassExam(account.isPassExam());
            accountResponse.setGroups(account.getGroups());
            accountResponse.setGender(account.getGender());
            accountResponse.setDepartment(account.getDepartment());
            accountResponse.setCreateDate(account.getCreateDate());
            accountResponses.add(accountResponse);
        }

        return accountResponses;
    }

}
