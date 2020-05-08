package com.organization.demo.apicontroller;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*; 
import io.swagger.annotations.ApiOperation;
import com.organization.demo.domain.EmployeeDomain;
import com.organization.demo.service.EmployeeService;

@RestController
//@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
@RequestMapping("/demo/Employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@ApiOperation(value="新增員工資料", notes="新增員工資料") 
	@PostMapping(value = "/AddEmployee/v1") 
	@ResponseStatus(HttpStatus.CREATED)
	public Object AddEmployee(@RequestBody EmployeeDomain request){
		//return addEmployee;
		return employeeService.AddEmployee(request);
	}
	
	@ApiOperation(value="修改員工資料", notes="修改員工資料") 
	@PatchMapping(value = "/ModEmployee/v1") 
	@ResponseStatus(HttpStatus.CREATED)
	public Object ModEmployee(@RequestBody EmployeeDomain request){
		//return addEmployee;
		return employeeService.ModEmployee(request);
	}
	
	@ApiOperation(value="刪除員工資料", notes="刪除員工資料") 
	@DeleteMapping(value = "/DelEmployee/v1/{number}") 
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void DelEmployee(@PathVariable("number") int number){
		//return DelEmployee;
		employeeService.DelEmployee(number);
	}
	
}
