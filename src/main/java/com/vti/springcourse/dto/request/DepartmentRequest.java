package com.vti.springcourse.dto.request;

import org.springframework.web.multipart.MultipartFile;

public class DepartmentRequest {

    private int id;
    private String name;
    private MultipartFile avatarFile;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
