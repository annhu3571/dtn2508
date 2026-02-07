package com.vti.assingment.fontend;

import com.vti.assingment.backend.businesslayer.AccountService;
import com.vti.assingment.backend.datalayer.AccountRepository;
import com.vti.assingment.backend.datalayer.QueryFromDB;
import com.vti.assingment.backend.datalayer.QueryFromPostgresql;
import com.vti.assingment.backend.dto.AccountResponse;
import com.vti.assingment.backend.presentationlayer.AccountController;
import com.vti.assingment.backend.validation.AccountValidation;
import com.vti.assingment.database.entity.Account;

import java.util.List;

public class Program {

    public static void addToInt(int x, int amountToAdd) {
         x = x + amountToAdd;
        System.out.println();
    }

    public static void main(String[] args) {
         int x = 15;
        int b = 10;
        Program.addToInt(x, b);
        System.out.println(x);
    }
}
