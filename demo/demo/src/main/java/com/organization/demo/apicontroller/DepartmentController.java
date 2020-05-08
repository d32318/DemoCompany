package com.organization.demo.apicontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.organization.demo.domain.DepartmentDomain;
import com.organization.demo.domain.EmployeeDomain;
import com.organization.demo.service.DepartmentService;

import io.swagger.annotations.ApiOperation;


@RestController
@RequestMapping("/demo/Department")
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;
	
	@ApiOperation(value="新增部門資料", notes="新增部門資料") 
	@PostMapping(value = "/AddDepartment/v1") 
	@ResponseStatus(HttpStatus.CREATED)
	public Object AddDepartment(@RequestBody DepartmentDomain request){
		//return addEmployee;
		return departmentService.AddDepartment(request);
	}
	
	@ApiOperation(value="修改部門資料", notes="修改部門資料") 
	@PatchMapping(value = "/ModDepartment/v1") 
	@ResponseStatus(HttpStatus.CREATED)
	public Object ModDepartment(@RequestBody DepartmentDomain request){
		//return addEmployee;
		return departmentService.ModDepartment(request);
	}
	
	@ApiOperation(value="刪除部門資料", notes="刪除部門資料") 
	@DeleteMapping(value = "/DelDepartment/v1/{departmentID}") 
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void DelDepartment(@PathVariable("departmentID") int departmentID){
		//return DelEmployee;
		departmentService.DelDepartment(departmentID);
	}
}
