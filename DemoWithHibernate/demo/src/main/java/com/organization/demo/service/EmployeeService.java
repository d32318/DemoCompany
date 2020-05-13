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
	
	public String EmployeeAdd(EmployeeBean employeeAdd) {
		return employeeDaoImpl.EmployeeAddDaoImpl(employeeAdd);
	}

	public boolean EmployeeDel(int number) {
		return employeeDaoImpl.EmployeeDelDaoImpl(number);
	}

	public String EmployeeMod(EmployeeBean employeeMod) {
		return employeeDaoImpl.EmployeeModDaoImpl(employeeMod);
	}

	public Object EmployeeReq(HashMap<String, String> employeeReq) {
		return employeeDaoImpl.EmployeeReqDaoImpl(employeeReq);
	}

}
