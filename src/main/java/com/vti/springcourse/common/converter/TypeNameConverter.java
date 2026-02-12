package com.vti.springcourse.common.converter;

import com.vti.springcourse.common.enums.TypeQuestionEnum;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class TypeNameConverter implements AttributeConverter<TypeQuestionEnum, String> {

    @Override
    public String convertToDatabaseColumn(TypeQuestionEnum attribute) {
        return attribute.getValue();
    }

    @Override
    public TypeQuestionEnum convertToEntityAttribute(String dbData) {
        return TypeQuestionEnum.convertToEnum(dbData);
    }
}
