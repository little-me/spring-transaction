package com.sunq.learning.spring.transaction.service.impl;

import com.sunq.learning.spring.transaction.dao.DepartmentDao;
import com.sunq.learning.spring.transaction.model.Department;
import com.sunq.learning.spring.transaction.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = Exception.class)
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentDao departmentDao;

    @Override
    public void addDepartmentError() {
        Department d = new Department();
        d.setId(1);
        d.setName("风部");
        departmentDao.insert(d);
        int n = 0/0;
    }

    @Override
    public void addDepartmentRequired() {
        Department d = new Department();
        d.setId(1);
        d.setName("风部");
        departmentDao.insert(d);
    }


    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void addDepartmentRequiredNew() {
        Department d = new Department();
        d.setId(1);
        d.setName("风部");
        departmentDao.insert(d);
    }

}
