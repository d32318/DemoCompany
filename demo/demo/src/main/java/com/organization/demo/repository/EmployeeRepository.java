package com.organization.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.organization.demo.domain.EmployeeDomain;

public interface EmployeeRepository extends JpaRepository<EmployeeDomain, String>{

}
