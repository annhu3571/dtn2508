package com.vti.assingment.backend.businesslayer;

import com.vti.assingment.backend.dto.AccountResponse;

import java.util.List;

public interface IAccountService {
    public List<AccountResponse> getAccounts();
}
