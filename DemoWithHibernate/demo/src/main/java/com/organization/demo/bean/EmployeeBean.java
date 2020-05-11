package com.organization.demo.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="company_employee")
public class EmployeeBean {

	private String name;
	@Id 
	@NotNull 
	//@GeneratedValue(generator = "jpa-uuid")
	private int number;
	@Column(name = "department_ID")
	private int departmentID;
	private String gender;
	private String phone;
	private String address;
	private int age;
	private String time_create;
	private String time_last_modified;
	
	
	public EmployeeBean() {
    }
	
	public EmployeeBean(String name, int number, int age, String departmentName) {
		super();
		DepartmentBean department= new DepartmentBean();
		this.name = name;
		this.number = number;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getDepartmentID() {
		return departmentID;
	}
	public void setDepartmentID(int departmentID) {
		this.departmentID = departmentID;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getTime_create() {
		return time_create;
	}
	public void setTime_create(String time_create) {
		this.time_create = time_create;
	}
	public String getTime_last_modified() {
		return time_last_modified;
	}
	public void setTime_last_modified(String time_last_modified) {
		this.time_last_modified = time_last_modified;
	}	
}
