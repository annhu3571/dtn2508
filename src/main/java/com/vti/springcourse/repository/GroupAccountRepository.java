package com.vti.springcourse.repository;

import com.vti.springcourse.entity.GroupAccount;
import com.vti.springcourse.entity.GroupAccountPk;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupAccountRepository extends JpaRepository<GroupAccount, GroupAccountPk> {
}
