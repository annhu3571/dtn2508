package com.vti.springcourse.mapper;

import com.vti.springcourse.dto.response.AccountResponse;
import com.vti.springcourse.entity.Account;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.util.ArrayList;
import java.util.List;

public class AccountMapper {

    public static Page<AccountResponse> map(Page<Account> accounts) {
        return new PageImpl<>(map(accounts.getContent()),
                accounts.getPageable(),
                accounts.getTotalElements());
    }

    public static List<AccountResponse> map(List<Account> accounts) {
        List<AccountResponse> accountResponses =  new ArrayList<>();
        for (Account account: accounts) {
            AccountResponse accountResponse = new AccountResponse();
            accountResponse.setEmail(account.getEmail());
//            accountResponse.setCreateDate(account.getCreateDate());
//            accountResponse.setDepartmentId(account.getDepartmentId());
            accountResponse.setUsername(account.getUserName());
            accountResponse.setFullName(account.getFullName());
            accountResponses.add(
                    accountResponse
            );
        }
        return accountResponses;
    }
}
