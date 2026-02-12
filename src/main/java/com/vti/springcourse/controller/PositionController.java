package com.vti.springcourse.controller;

import com.vti.springcourse.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/v1/positions")
public class PositionController {

    @Autowired
    private PositionService positionService;

    @DeleteMapping(value = "/{id}")
    public String delete(@PathVariable int id) {
        positionService.deletePosition(id);
        return "OK";
    }
}
