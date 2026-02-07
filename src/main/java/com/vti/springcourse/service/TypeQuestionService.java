package com.vti.springcourse.service;

import com.vti.springcourse.entity.TypeQuestion;
import com.vti.springcourse.repository.TypeQuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeQuestionService {

    @Autowired
    private TypeQuestionRepository typeQuestionRepository;

    public List<TypeQuestion> getAll() {
        return typeQuestionRepository.findAll();
    }
}
