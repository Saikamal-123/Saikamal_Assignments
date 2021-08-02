package com.jdbc.rest;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id @GeneratedValue
	Integer empid;
	String empname;
	String empdept;
	String empdes;
	public Employee(Integer empid,String empname, String empdept, String empdes) {
		this.empid=empid;
		this.empname = empname;
		this.empdept = empdept;
		this.empdes = empdes;
	}
	public Integer getEmpid() {
		return empid;
	}
	public void setEmpid(Integer empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpdept() {
		return empdept;
	}
	public void setEmpdept(String empdept) {
		this.empdept = empdept;
	}
	public String getEmpdes() {
		return empdes;
	}
	public void setEmpdes(String empdes) {
		this.empdes = empdes;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empdept=" + empdept + ", empdes=" + empdes
				+ "]";
	}
	
	
	

}
