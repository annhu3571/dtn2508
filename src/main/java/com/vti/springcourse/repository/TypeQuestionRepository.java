package com.vti.springcourse.repository;

import com.vti.springcourse.entity.TypeQuestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeQuestionRepository extends JpaRepository<TypeQuestion, Integer> {
}
