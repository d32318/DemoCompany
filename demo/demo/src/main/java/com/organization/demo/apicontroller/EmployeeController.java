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
	
	@ApiOperation(value="添加員工", notes="添加員工") 
	@PostMapping(value = "/AddEmployee/v1") 
	@ResponseStatus(HttpStatus.CREATED)
	public Object AddEmployee(@RequestBody EmployeeDomain request){
		//return addEmployee;
		return employeeService.AddEmployee(request);
	}
	
}
