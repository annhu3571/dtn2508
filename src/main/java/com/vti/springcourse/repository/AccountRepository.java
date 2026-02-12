package com.vti.springcourse.repository;

import com.vti.springcourse.entity.Account;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer>, JpaSpecificationExecutor<Account> {


    @Query("SELECT a FROM Account a where a.username like %:userName%")
    Page<Account> findByUserName(String userName, Pageable pageable);


    @Query("SELECT a FROM Account a where a.fullName like %:fullName% ")
    List<Account> findByFullName(String fullName);


    @Query(value = "Select * from Account a where a.username like %:id%", nativeQuery = true)
    List<Account> findByUsername(String userName);
    @Query("SELECT a FROM Account a where a.accountId = :id")
    Account getAccountById(int id);

    @Query(value = "SELECT * FROM account a where a.account_id = :id", nativeQuery = true)
    Account getAccountByIdV2(int id);

    @Query("DELETE FROM Account a where a.accountId = :id")
    @Modifying
    void deleteAccount(int id);
}
