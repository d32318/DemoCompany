package com.organization.demo.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="company_department")
public class DepartmentBean {

	@Id 
	@NotNull 
	//@GeneratedValue(generator = "jpa-uuid")
	@Column(name = "department_ID")
	private int departmentID;
	@Column(name = "department_name")
	private String departmentName;
	
	public int getDepartmentID() {
		return departmentID;
	}
	
	public void setDepartmentID(int departmentID) {
		this.departmentID = departmentID;
	}
	
	public String getDepartmentName() {
		return departmentName;
	}
	
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
}
