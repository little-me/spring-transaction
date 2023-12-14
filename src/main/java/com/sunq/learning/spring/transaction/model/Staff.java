package com.sunq.learning.spring.transaction.model;

import lombok.Data;
import org.beetl.sql.annotation.entity.Table;

@Data
@Table(name = "my_staff")
public class Staff {
    private Integer id;
    private String name;
    private Integer dep_id;
}
