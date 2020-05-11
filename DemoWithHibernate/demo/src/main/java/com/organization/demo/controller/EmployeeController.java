package com.organization.demo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.hibernate.mapping.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	public Object AddEmployee(@RequestBody EmployeeBean employeeAdd){
		return employeeService.EmployeePut(employeeAdd);
	}
	
	@ApiOperation(value="刪除員工資料", notes="刪除員工資料") 
	@DeleteMapping(value = "/EmployeeDel/v1") 
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void DelEmployee(@RequestParam("number") int number){
		employeeService.EmployeeDel(number);
	}
	
	@ApiOperation(value="修改員工資料", notes="修改員工資料") 
	@PatchMapping(value = "/EmployeeMod/v1") 
	@ResponseStatus(HttpStatus.CREATED)
	public Object ModEmployee(@RequestBody EmployeeBean employeeMod){
		return employeeService.EmployeeMod(employeeMod);
	}
	
	@ApiOperation(value="查詢員工資料", notes="查詢員工資料") 
	@GetMapping(value = "/EmployeeReq/v1") 
	@ResponseStatus(HttpStatus.OK)
	public Object ReqEmployee(@RequestParam(value = "name", required = false) String name, 
							  @RequestParam(value = "number", required = false) String number, 
							  @RequestParam(value = "age", required = false) String age, 
							  @RequestParam(value = "departmentName", required = false) String departmentName){
//		Object queryData = EmployeeBean 
//		return employeeService.employeeReq(employeeReq);
		HashMap<String, String> employeeReq = new HashMap<String,String>();
		employeeReq.put("name", name);
		if(number != null) {
			employeeReq.put("number", number);
		}
		if(age != null) {
			employeeReq.put("age", age);
		}
		employeeReq.put("departmentName", departmentName);
		return employeeService.employeeReq(employeeReq);
	}
}
