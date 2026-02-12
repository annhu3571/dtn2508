package com.vti.springcourse.dto.response;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.Date;
import java.util.Objects;

@NoArgsConstructor
@Data
@ToString
public class AccountResponse {

    private  String email;
    private String username;
    private String fullName;
}
