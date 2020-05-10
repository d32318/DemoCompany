package com.organization.demo.daoimpl;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.organization.demo.bean.DepartmentBean;
import com.organization.demo.utils.HibernateUtil;

@Repository
public class DepartmentDaoImpl {

	public Object DepartmentAddDaoImpl(DepartmentBean departmentAdd) {

		// 開啟Session，相當於開啟JDBC的Connection
        Session session = HibernateUtil.getSessionFactory().openSession();
        // Transaction表示一組會話操作
        Transaction tx= null;
		
		try {
			tx = session.beginTransaction();
			session.save(departmentAdd);
			tx.commit();
			session.close(); 
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
			throw new RuntimeException(e);
		}
		return "{\"Result\":\"Success\"}";
	}

	public void DepartmentDelDaoImpl(int departmentID) {

		// 開啟Session，相當於開啟JDBC的Connection
        Session session = HibernateUtil.getSessionFactory().openSession();
        // Transaction表示一組會話操作
        Transaction tx= null;
		
		try {
			tx = session.beginTransaction();
			Integer ipk = Integer.valueOf(departmentID);
			DepartmentBean dep = new DepartmentBean();
			dep.setDepartmentID(ipk);
			session.delete(dep);
			tx.commit();
			session.close(); 
//			return "{\"Result\":\"Success\"}";
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
			throw new RuntimeException(e);
		}
	}

	public Object DepartmentModDaoImpl(DepartmentBean departmentMod) {
		// 開啟Session，相當於開啟JDBC的Connection
        Session session = HibernateUtil.getSessionFactory().openSession();
        // Transaction表示一組會話操作
        Transaction tx= null;
		
		try {
			DepartmentBean dep = null;
			tx = session.beginTransaction();
			dep = (DepartmentBean)session.get(DepartmentBean.class, departmentMod.getDepartmentID()); 
			dep.setDepartmentName(departmentMod.getDepartmentName());
			session.update(dep);
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
