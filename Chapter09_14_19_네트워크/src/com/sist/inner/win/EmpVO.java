package com.sist.inner.win;
/*
 *  
 EMPNO NOT NULL NUMBER(4) int
 ENAM VARCHAR2(10) String
 JOB VARCHAR2(9) String
 MGR NUMBER(4) int
 HIREDATE DATE java.util.Date
 SAL NUMBER(7,2) int => double
 COMM NUMBER(7,2) int => double
 DEPTNO UMBER(2) int
 */

import java.util.Date;

import lombok.Data;
@Data
public class EmpVO {
private int empno;
	private String ename;
	private String job;
	private int mgr;
	private Date hiredate;
	private int sal;
	private int comm;
	private int deptno;
}
