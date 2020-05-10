package com.organization.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.organization.demo.bean.EmployeeBean;
import com.organization.demo.daoimpl.EmployeeDaoImpl;


@Service
public class EmployeeService {
	
	@Autowired
	EmployeeDaoImpl employeeDaoImpl;
	
	public String EmployeePut(EmployeeBean employeePut) {
		return employeeDaoImpl.EmployeePutDaoImpl(employeePut);
	}

	public void EmployeeDel(int number) {
		employeeDaoImpl.EmployeeDelDaoImpl(number);
	}

	public String EmployeeMod(EmployeeBean employeeMod) {
		return employeeDaoImpl.EmployeeModDaoImpl(employeeMod);
	}

}
