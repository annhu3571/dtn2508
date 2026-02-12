package com.vti.springcourse.dto.request;

import com.vti.springcourse.common.enums.TypeQuestionEnum;

public class TypeQuestionRequest {

    private TypeQuestionEnum typeName;

    public TypeQuestionEnum getTypeName() {
        return typeName;
    }

    public void setTypeName(TypeQuestionEnum typeName) {
        this.typeName = typeName;
    }
}
