package com.organization.demo;

import java.util.HashMap;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.organization.demo.bean.DepartmentBean;
import com.organization.demo.bean.EmployeeBean;
import com.organization.demo.daoimpl.DepartmentDaoImpl;
import com.organization.demo.daoimpl.EmployeeDaoImpl;
import com.organization.demo.service.DepartmentService;
import com.organization.demo.service.EmployeeService;

@RunWith(SpringRunner.class)
@SpringBootTest
class DemoApplicationTests {
	
	@MockBean
    DepartmentDaoImpl departmentDaoImpl;
	
	@MockBean
    EmployeeDaoImpl employeeDaoImpl;
	
	@MockBean
	DepartmentBean department;
	
	@MockBean
	HashMap<String, String> employeeReq;
	
	@MockBean
	EmployeeBean employee;
	
	@Autowired
    DepartmentService departmentService;
	
	@Autowired
    EmployeeService employeeService;
	
    /*
     * 
     * 單元測試部分，不針對Controller的部分測試，
     * 因為程式啟動後可以使用PostMan等測試工具，
     * 更準確知道是否能透過其他APP連線到Controller
     * 還能順帶驗證前端請求呼叫的程式中的content-type、Accept等等的http標頭是否正確
     * 
	 */
	
	//測試增加部門資料
	@Test
	public void testDepartmentAdd() throws Exception {
		department.setDepartmentID(12345);
		department.setDepartmentName("TestDepartment");
		Mockito.when(departmentService.DepartmentAdd(department)).thenReturn("{\"Result\":\"Success\"}");
		Mockito.when(departmentDaoImpl.DepartmentAddDaoImpl(department)).thenReturn("{\"Result\":\"Success\"}");
	}
	
	//測試刪除部門資料
	@Test
	public void testDepartmentDel() throws Exception {
		final int departmentID = 0;
		Mockito.when(departmentService.DepartmentDel(departmentID)).thenReturn(true);
		Mockito.when(departmentDaoImpl.DepartmentDelDaoImpl(departmentID)).thenReturn(true);
	}
	
	//測試修改部門資料
	@Test
	public void testDepartmentMod() throws Exception {
		department.setDepartmentID(12345);
		department.setDepartmentName("TestDepartment");
		Mockito.when(departmentService.DepartmentMod(department)).thenReturn("{\"Result\":\"Success\"}");
		Mockito.when(departmentDaoImpl.DepartmentModDaoImpl(department)).thenReturn("{\"Result\":\"Success\"}");
	}
	
	//測試增加員工資料
	@Test
	public void testEmployeeAdd() throws Exception {
		employee.setName("TestEmployee");
		employee.setNumber(12345);
		employee.setDepartmentID(10001);
		employee.setGender("Male");
		employee.setPhone("0912345678");
		employee.setAddress("Taipei");
		employee.setAge(30);
		Mockito.when(employeeService.EmployeeAdd(employee)).thenReturn("{\"Result\":\"Success\"}");
		Mockito.when(employeeDaoImpl.EmployeeAddDaoImpl(employee)).thenReturn("{\"Result\":\"Success\"}");
	}
	
	//測試刪除員工資料
	@Test
	public void testEmployeeDel() throws Exception {
		final int number = 0;
		Mockito.when(employeeService.EmployeeDel(number)).thenReturn(true);
		Mockito.when(employeeDaoImpl.EmployeeDelDaoImpl(number)).thenReturn(true);
	}

	//測試刪除員工資料
	@Test
	public void testEmployeeMod() throws Exception {
		employee.setName("TestEmployee");
		employee.setNumber(12345);
		employee.setDepartmentID(10001);
		employee.setGender("Male");
		employee.setPhone("0912345678");
		employee.setAddress("Taipei");
		employee.setAge(30);
		Mockito.when(employeeService.EmployeeMod(employee)).thenReturn("{\"Result\":\"Success\"}");
		Mockito.when(employeeDaoImpl.EmployeeModDaoImpl(employee)).thenReturn("{\"Result\":\"Success\"}");
	}
	
	//測試查詢員工資料
	@Test
	public void testEmployeeReq() throws Exception {
		employeeReq.put("name", "Mary");
		employeeReq.put("number", "12345");
		employeeReq.put("age", "40");
		employeeReq.put("departmentName", "金融部");
		employeeReq.put("StartPage", "1");
		Mockito.when(employeeService.EmployeeReq(employeeReq)).thenReturn("{\"Result\":\"Success\"}");
		Mockito.when(employeeDaoImpl.EmployeeReqDaoImpl(employeeReq)).thenReturn("{\"Result\":\"Success\"}");
	}
}
