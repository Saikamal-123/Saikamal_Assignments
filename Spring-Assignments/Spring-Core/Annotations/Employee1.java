package com.annotation.inject;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee1 {

	@Autowired
	private Address1 address;
	
	@Autowired
	public void setAddress(Address1 address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}

	//@Autowired
	public Employee1(Address1 address) {
		super();
		this.address = address;
	}

	public Employee1() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
