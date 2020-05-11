package com.organization.demo.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.organization.demo.bean.EmployeeBean;
import com.organization.demo.daoimpl.EmployeeDaoImpl;


@Service
public class EmployeeService {
	
	@Autowired
	EmployeeDaoImpl employeeDaoImpl;
	
	public String EmployeePut(EmployeeBean employeeAdd) {
		return employeeDaoImpl.EmployeePutDaoImpl(employeeAdd);
	}

	public void EmployeeDel(int number) {
		employeeDaoImpl.EmployeeDelDaoImpl(number);
	}

	public String EmployeeMod(EmployeeBean employeeMod) {
		return employeeDaoImpl.EmployeeModDaoImpl(employeeMod);
	}

	public Object employeeReq(HashMap<String, String> employeeReq) {
		return employeeDaoImpl.EmployeeReqDaoImpl(employeeReq);
	}

}
