package com.organization.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

import com.organization.demo.bean.EmployeeBean;
import com.organization.demo.service.EmployeeService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/demo/Employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;

	@ApiOperation(value="新增員工資料", notes="新增員工資料") 
	@PostMapping(value = "/EmployeeAdd/v1") 
	@ResponseStatus(HttpStatus.CREATED)
	public Object AddEmployee(@RequestBody EmployeeBean employeePut){
		return employeeService.EmployeePut(employeePut);
	}
	
	@ApiOperation(value="刪除員工資料", notes="刪除員工資料") 
	@DeleteMapping(value = "/EmployeeDel/v1/{number}") 
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void DelEmployee(@PathVariable("number") int number){
		employeeService.EmployeeDel(number);
	}
	
	@ApiOperation(value="修改員工資料", notes="修改員工資料") 
	@PatchMapping(value = "/EmployeeMod/v1") 
	@ResponseStatus(HttpStatus.CREATED)
	public Object ModEmployee(@RequestBody EmployeeBean request){
		return employeeService.EmployeeMod(request);
	}
}
