package com.sunq.learning.spring.transaction.service.impl;

import com.sunq.learning.spring.transaction.dao.StaffDao;
import com.sunq.learning.spring.transaction.model.Staff;
import com.sunq.learning.spring.transaction.service.DepartmentService;
import com.sunq.learning.spring.transaction.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StaffServiceImpl implements StaffService {

    @Autowired
    private StaffDao staffDao;
    @Autowired
    private DepartmentService departmentService;

    @Override
    public void addStaffNoTransaction() {
        Staff s = new Staff();
        s.setId(1);
        s.setName("风婆婆");
        s.setDep_id(1);
        staffDao.insert(s);
        int n = 0/0;
    }

    @Override
    public void addStaffWithDepNoTransaction() {
        departmentService.addDepartmentRequired();
        addStaffNoTransaction();
    }

    @Override
    @Transactional
    public void addStaffWithDepRequired() {
        departmentService.addDepartmentRequired();
        addStaffNoTransaction();
    }

    @Override
    @Transactional
    public void addStaffWithDepRequiredNew() {
        departmentService.addDepartmentRequiredNew();
        addStaffNoTransaction();
    }

}
