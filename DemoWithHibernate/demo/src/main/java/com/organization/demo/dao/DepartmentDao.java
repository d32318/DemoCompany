package com.organization.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.organization.demo.bean.DepartmentBean;

public interface DepartmentDao  extends JpaRepository<DepartmentBean, Integer>{

}
