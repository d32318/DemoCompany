package com.organization.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.organization.demo.domain.EmployeeDomain;
import com.organization.demo.repository.EmployeeDao;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
	
	public String AddEmployee(EmployeeDomain request) {
		// TODO Auto-generated constructor stub
		
		return employeeDao.addEmployee(request);
	}

	public void DelEmployee(int number) {
		// TODO Auto-generated method stub
		
		employeeDao.delEmployee(number);
	}

	public String ModEmployee(EmployeeDomain request) {
		// TODO Auto-generated method stub
		
		return employeeDao.modEmployee(request);
	}

	public String SearchEmployee(EmployeeDomain request) {
		// TODO Auto-generated method stub
		
		return employeeDao.searchEmployee(request);
	}

}
