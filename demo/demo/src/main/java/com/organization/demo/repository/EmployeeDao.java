package com.organization.demo.repository;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.organization.demo.domain.EmployeeDomain;

@Repository
public class EmployeeDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public EmployeeDao() {
		// TODO Auto-generated constructor stub
	}
	
	public String addEmployee(EmployeeDomain request) {
		
		Date currentDateTime = new Date();
		SimpleDateFormat dateTimeft = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss");
		
		jdbcTemplate.execute("insert into COMPANY_EMPLOYEE (name, number, department_id, gender, phone, "
				+ "address,age, time_create,time_last_modified) values ('" 
			    + request.getName() +"','" 
				+ request.getNumber() +"','"
				+ request.getDepartmentID() +"','"
				+ request.getGender() +"','"
				+ request.getPhone() +"','"
			    + request.getAddress() + "','"
			    + request.getAge() +"','"
			    + dateTimeft.format(currentDateTime).toString() +"','"
			    + dateTimeft.format(currentDateTime).toString() + "')");
		
		return "{\"Result\":\"Success\"}";
	}

}
