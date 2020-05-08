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

	public void delEmployee(int number) {
		// TODO Auto-generated method stub
		jdbcTemplate.execute("delete from COMPANY_EMPLOYEE where number=" + number);
		System.out.println("Delete");
	}

	public String modEmployee(EmployeeDomain request) {
		// TODO Auto-generated method stub
		Date currentDateTime = new Date();
		SimpleDateFormat dateTimeft = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss");
		
		jdbcTemplate.execute("update COMPANY_EMPLOYEE set "
				+ "name = '" + request.getName() +"',"
				+ "number = '" + request.getNumber() +"',"
				+ "department_id = '" + request.getDepartmentID() +"',"
				+ "gender = '" + request.getGender() +"',"
				+ "phone = '" + request.getPhone() +"',"
				+ "address = '" + request.getAddress() + "',"
				+ "age = '" + request.getAge() +"',"
				+ "time_last_modified = '" + dateTimeft.format(currentDateTime).toString() +"' "
				+ "where number = '" + request.getNumber() +"'");
		
		return "{\"Result\":\"Success\"}";
	}

	public String searchEmployee(EmployeeDomain request) {
		// TODO Auto-generated method stub
		
		return null;
	}

}
