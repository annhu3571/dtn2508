package com.vti.springcourse.repository;

import com.vti.springcourse.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {

    List<Account> findByFullName(String fullName);

    @Query("SELECT a FROM Account a where a.accountId = :id")
    Account getAccountById(int id);

    @Query(value = "SELECT * FROM account a where a.account_id = :id", nativeQuery = true)
    Account getAccountByIdV2(int id);

    @Query("DELETE FROM Account a where a.accountId = :id")
    @Modifying
    void deleteAccount(int id);
}
