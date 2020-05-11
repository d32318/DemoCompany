package com.organization.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.organization.demo.bean.EmployeeBean;

public interface EmployeeDao extends JpaRepository<EmployeeBean, Integer>{

}
