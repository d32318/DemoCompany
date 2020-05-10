package com.organization.demo.daoimpl;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.organization.demo.bean.EmployeeBean;
import com.organization.demo.utils.HibernateUtil;

@Repository
public class EmployeeDaoImpl{
	
	public String EmployeePutDaoImpl(EmployeeBean employeePut) {

		// 開啟Session，相當於開啟JDBC的Connection
        Session session = HibernateUtil.getSessionFactory().openSession();
        // Transaction表示一組會話操作
        Transaction tx= null;
		
		//設定創建時間
		//設定最後修改時間
		//時間格式轉型成 yyyy-MM-dd'T'hh:mm:ss
		Date currentDateTime = new Date();
		SimpleDateFormat dateTimeft = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss");
		employeePut.setTime_create(dateTimeft.format(currentDateTime).toString());
		employeePut.setTime_last_modified(dateTimeft.format(currentDateTime).toString());
		
		try {
			tx = session.beginTransaction();
			session.save(employeePut);
			tx.commit();
			session.close(); 
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
			throw new RuntimeException(e);
		}
		return "{\"Result\":\"Success\"}";
	}

	public void EmployeeDelDaoImpl(int number) {
		
		// 開啟Session，相當於開啟JDBC的Connection
        Session session = HibernateUtil.getSessionFactory().openSession();
        // Transaction表示一組會話操作
        Transaction tx= null;
		
		try {
			tx = session.beginTransaction();
			Integer ipk = Integer.valueOf(number);
			EmployeeBean emp = new EmployeeBean();
			emp.setNumber(ipk);
			session.delete(emp);
			tx.commit();
			session.close(); 
//			return "{\"Result\":\"Success\"}";
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
			throw new RuntimeException(e);
		}
	}

	public String EmployeeModDaoImpl(EmployeeBean employeeMod) {
		// 開啟Session，相當於開啟JDBC的Connection
        Session session = HibernateUtil.getSessionFactory().openSession();
        // Transaction表示一組會話操作
        Transaction tx= null;
		
        
        
		//設定創建時間
		//設定最後修改時間
		//時間格式轉型成 yyyy-MM-dd'T'hh:mm:ss
		Date currentDateTime = new Date();
		SimpleDateFormat dateTimeft = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss");
		employeeMod.setTime_last_modified(dateTimeft.format(currentDateTime).toString());
		
		try {
			EmployeeBean emp = null;
			tx = session.beginTransaction();
			emp = (EmployeeBean)session.get(EmployeeBean.class, employeeMod.getNumber()); 
			emp.setAddress(employeeMod.getAddress());
			emp.setAge(employeeMod.getAge());
			emp.setDepartmentID(employeeMod.getDepartmentID());
			emp.setGender(employeeMod.getGender());
			emp.setName(employeeMod.getName());
			emp.setPhone(employeeMod.getPhone());
			emp.setTime_last_modified(employeeMod.getTime_last_modified());
			session.update(emp);
			tx.commit();
			session.close(); 
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
			throw new RuntimeException(e);
		}
		return "{\"Result\":\"Success\"}";
	}
}
