package com.sunq.learning.spring.transaction.controller;

import com.sunq.learning.spring.transaction.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/dep")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping (value="/add")
    public void addDepartment() {
        departmentService.addDepartmentRequired();
    }

    @GetMapping (value="/add/err")
    public void addDepartmentError() {
        departmentService.addDepartmentError();
    }
}
