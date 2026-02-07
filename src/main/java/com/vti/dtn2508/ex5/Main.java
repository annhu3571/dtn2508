package com.vti.dtn2508.ex5;

import com.vti.dtn2508.entity.Account;
import com.vti.dtn2508.entity.Run;
import com.vti.dtn2508.exception.LoginFailedException;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) {
        login(new Account());
    }

    private static void login(Account a) {
           throw new LoginFailedException("User login failed");
    }

    private static int getMaxVal(int[] number) {
        int maxVal = number[10];
        for (int i = 1; i < number.length; i++) {
            if (number[i] > maxVal){
                maxVal = number[i];
            }
        }
        return maxVal;
    }

    private static int getMin(int[] number) {
        int minVal = number[0];
        for (int i = 1; i <= number.length - 1; i++) {
            if (number[i] < minVal){
                minVal = number[i];
            }
        }
        return minVal;
    }



}
