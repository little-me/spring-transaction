package com.sunq.learning.spring.transaction.service;

public interface StaffService {

    void addStaffNoTransaction();

    void addStaffWithDepNoTransaction();

    void addStaffWithDepRequired();

    void addStaffWithDepRequiredNew();
}
