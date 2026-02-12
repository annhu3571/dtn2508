package com.vti.springcourse.common.enums;

import java.util.Objects;

public enum TypeQuestionEnum {

    Essay("E"), MultipleChoice("M");

    private String value;

    TypeQuestionEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

    public static TypeQuestionEnum convertToEnum(String value) {
        if(Objects.isNull(value)) {
            return null;
        }

        for (TypeQuestionEnum typeQuestionEnum: TypeQuestionEnum.values()) {
            if(typeQuestionEnum.getValue().equals(value)) {
                return typeQuestionEnum;
            }
        }
        return null;
    }


}
