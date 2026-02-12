package com.vti.springcourse.repository;

import com.vti.springcourse.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {


}
