package com.vti.springcourse.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

import java.time.LocalDateTime;

@Entity
public class GroupAccount {

    @EmbeddedId
    private GroupAccountPk id;
    private LocalDateTime joinDate;

    public LocalDateTime getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(LocalDateTime joinDate) {
        this.joinDate = joinDate;
    }

    public GroupAccountPk getId() {
        return id;
    }

    public void setId(GroupAccountPk id) {
        this.id = id;
    }
}
