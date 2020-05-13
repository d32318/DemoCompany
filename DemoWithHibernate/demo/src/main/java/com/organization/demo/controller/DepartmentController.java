package com.organization.demo.controller;

import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.organization.demo.bean.DepartmentBean;
import com.organization.demo.daoimpl.DepartmentDaoImpl;
import com.organization.demo.daoimpl.EmployeeDaoImpl;
import com.organization.demo.service.DepartmentService;

import io.swagger.annotations.ApiOperation;

import org.springframework.http.HttpStatus;


@RestController
@RequestMapping("/demo/Department")
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;
	
	
	
	@ApiOperation(value="新增部門資料", notes="新增部門資料") 
	@PostMapping(value = "/DepartmentAdd/v1") 
	@ResponseStatus(HttpStatus.CREATED)
	public Object AddDepartment(@RequestBody DepartmentBean departmentAdd){
		return departmentService.DepartmentAdd(departmentAdd);
	}
	
	@ApiOperation(value="刪除部門資料", notes="刪除部門資料") 
	@DeleteMapping(value = "/DepartmentDel/v1") 
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void DelDepartment(@RequestParam("departmentID") int departmentID){
		departmentService.DepartmentDel(departmentID);
	}
	
	@ApiOperation(value="修改部門資料", notes="修改部門資料") 
	@PatchMapping(value = "/DepartmentMod/v1") 
	@ResponseStatus(HttpStatus.CREATED)
	public Object ModDepartment(@RequestBody DepartmentBean departmentMod){
		return departmentService.DepartmentMod(departmentMod);
	}
}
