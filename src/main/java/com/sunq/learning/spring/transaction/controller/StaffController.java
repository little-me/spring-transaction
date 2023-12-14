package com.sunq.learning.spring.transaction.controller;

import com.sunq.learning.spring.transaction.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/staff")
public class StaffController {

    @Autowired
    private StaffService staffService;

    @GetMapping (value="/add/no")
    public void addStaffWithDepNoTransaction() {
        staffService.addStaffWithDepNoTransaction();
    }

    @GetMapping (value="/add/re")
    public void addStaffWithDepRequired() {
        staffService.addStaffWithDepRequired();
    }

    @GetMapping (value="/add/new")
    public void addStaffWithDepRequiredNew() {
        staffService.addStaffWithDepRequiredNew();
    }
}
