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
		return departmentDao.addDepartment(request);
	}

	public void DelDepartment(int number) {
		departmentDao.delDepartment(number);
	}

	public String ModDepartment(DepartmentDomain request) {
		return departmentDao.modDepartment(request);
	}
}
