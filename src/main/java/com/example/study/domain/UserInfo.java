package com.example.study.domain;

import java.sql.Date;

import lombok.Data;
// model
@Data
public class UserInfo {
    private int empno;
    private String ename;
    private String job;
    private int mgr;
    private Date hiredate;
    private int deptno;
}
