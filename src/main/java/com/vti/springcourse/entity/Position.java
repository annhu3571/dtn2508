package com.vti.springcourse.entity;

import com.vti.springcourse.common.enums.PositionName;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Position {

    @Id
    private int positionId;

    @Enumerated(value = EnumType.STRING)
    private PositionName positionName;

    @OneToMany(mappedBy = "position")
    private List<Account> accounts;

    public int getPositionId() {
        return positionId;
    }

    public void setPositionId(int positionId) {
        this.positionId = positionId;
    }

    public PositionName getPositionName() {
        return positionName;
    }

    public void setPositionName(PositionName positionName) {
        this.positionName = positionName;
    }

    public List<Account> getAccount() {
        return accounts;
    }

    public void setAccount(List<Account> account) {
        this.accounts = account;
    }
}
