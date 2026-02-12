package com.vti.springcourse.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class GroupAccountPk {

    private int accountId;
    private int groupId;

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }
}
