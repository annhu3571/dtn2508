package com.vti.springcourse.repository.specification;

import com.vti.dtn2508.util.StringUtil;
import com.vti.springcourse.entity.Account;
import org.springframework.data.jpa.domain.Specification;

public class AccountSpecification {

    @SuppressWarnings("removal")
    public static Specification<Account> buildWhere(String search) {
        if(search == null) {
            return  null;
        }
        CustomSpecification customSpecification = new CustomSpecification("username", search);

        return Specification.where(customSpecification);
    }
}
