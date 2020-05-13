package com.organization.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.organization.demo.bean.DepartmentBean;
import com.organization.demo.daoimpl.DepartmentDaoImpl;

@Service
public class DepartmentService {

	@Autowired
	DepartmentDaoImpl departmentDaoImpl;
	
	public Object DepartmentAdd(DepartmentBean departmentAdd) {
		return departmentDaoImpl.DepartmentAddDaoImpl(departmentAdd);
	}

	public boolean DepartmentDel(int departmentID) {
		return departmentDaoImpl.DepartmentDelDaoImpl(departmentID);
		
	}

	public Object DepartmentMod(DepartmentBean departmentMod) {
		return departmentDaoImpl.DepartmentModDaoImpl(departmentMod);
	}

}
