package com.sunq.learning.spring.transaction.model;


import lombok.Data;
import org.beetl.sql.annotation.entity.Table;

@Data
@Table(name = "my_department")
public class Department {
    private Integer id;
    private String name;
}
