package com.vti.springcourse.controller;


import com.vti.springcourse.entity.TypeQuestion;
import com.vti.springcourse.service.TypeQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/type-questions")
public class TypeQuestionController {

    @Autowired
    private TypeQuestionService typeQuestionService;

    @GetMapping
    public List<TypeQuestion> getAll() {
        return  typeQuestionService.getAll();
    }
}
