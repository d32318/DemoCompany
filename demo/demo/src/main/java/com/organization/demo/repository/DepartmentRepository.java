package com.organization.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.organization.demo.domain.DepartmentDomain;

public interface DepartmentRepository extends JpaRepository<DepartmentDomain, String>{

}
