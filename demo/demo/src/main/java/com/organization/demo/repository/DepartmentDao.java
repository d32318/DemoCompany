package com.organization.demo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.organization.demo.domain.DepartmentDomain;

@Repository
public class DepartmentDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public DepartmentDao() {
		
	}

	public String addDepartment(DepartmentDomain request) {
		// TODO Auto-generated method stub
		jdbcTemplate.execute("insert into COMPANY_DEPARTMENT (DEPARTMENT_ID, DEPARTMENT_NAME) values ('" 
			    + request.getDepartmentID() +"','" 
				+ request.getDepartmentName() + "')");
		
		return "{\"Result\":\"Success\"}";
	}

	public void delDepartment(int number) {
		// TODO Auto-generated method stub
		
		jdbcTemplate.execute("delete from COMPANY_DEPARTMENT where DEPARTMENT_ID=" + number);
		System.out.println("Delete");
	}

	public String modDepartment(DepartmentDomain request) {
		// TODO Auto-generated method stub
		
		jdbcTemplate.execute("update COMPANY_DEPARTMENT set "
				+ "Department_name = '" + request.getDepartmentName() +"' "
				+ "where Department_ID = '" + request.getDepartmentID() +"'");
		
		return "{\"Result\":\"Success\"}";
	}
	
}
