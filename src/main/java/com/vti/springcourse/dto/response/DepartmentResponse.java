package com.vti.springcourse.dto.response;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class DepartmentResponse {

    private String departmentName;
    private List<AccountResponse> accounts;
}
