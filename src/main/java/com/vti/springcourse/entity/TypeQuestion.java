package com.vti.springcourse.entity;

import com.vti.springcourse.common.enums.TypeQuestionEnum;
import jakarta.persistence.*;

@Entity
public class TypeQuestion {

    @Id
    private int typeId;

    @Column(name = "type_name")
    @Enumerated(EnumType.ORDINAL)
    private TypeQuestionEnum typeQuestion;

    public TypeQuestion() {
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public TypeQuestionEnum getTypeQuestion() {
        return typeQuestion;
    }

    public void setTypeQuestion(TypeQuestionEnum typeQuestion) {
        this.typeQuestion = typeQuestion;
    }
}
