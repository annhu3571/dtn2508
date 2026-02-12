package com.vti.springcourse.repository.specification;

import com.vti.springcourse.entity.Account;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.domain.Specification;

import java.util.Objects;

@NoArgsConstructor
@Data
@RequiredArgsConstructor
public class CustomSpecification implements Specification<Account> {

    @NonNull
    private String filed;
    @NonNull
    private Object value;

    @Override
    public Predicate toPredicate(Root<Account> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
       if(Objects.equals(filed, "username")) {
           return criteriaBuilder.like(root.get("username"), "%"+value.toString()+"%");
       }
       return null;
    }
}
