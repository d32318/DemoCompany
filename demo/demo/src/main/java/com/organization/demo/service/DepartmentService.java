package com.organization.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.organization.demo.domain.DepartmentDomain;
import com.organization.demo.repository.DepartmentDao;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentDao departmentDao;
	
	public String AddDepartment(DepartmentDomain request) {
		// TODO Auto-generated constructor stub
		
		return departmentDao.addDepartment(request);
	}

	public void DelDepartment(int number) {
		// TODO Auto-generated method stub
		
		departmentDao.delDepartment(number);
	}

	public String ModDepartment(DepartmentDomain request) {
		// TODO Auto-generated method stub
		
		return departmentDao.modDepartment(request);
	}
}
