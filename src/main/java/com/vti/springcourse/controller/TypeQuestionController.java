package com.vti.springcourse.controller;


import com.vti.springcourse.dto.request.TypeQuestionRequest;
import com.vti.springcourse.entity.TypeQuestion;
import com.vti.springcourse.service.TypeQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public String createTypeQuestion(@RequestBody TypeQuestionRequest typeQuestionRequest) {
        typeQuestionService.createTypeQuestion(typeQuestionRequest);
        return "OK";
    }
}
