package com.mphasis.firsthibernateapp;

import org.hibernate.Session;

import com.mphasis.firsthibernateapp.dao.EmployeeDAO;
import com.mphasis.firsthibernateapp.model.Address;
import com.mphasis.firsthibernateapp.model.Customer;
import com.mphasis.firsthibernateapp.model.Department;
import com.mphasis.firsthibernateapp.model.Employee;
import com.mphasis.firsthibernateapp.model.Locker;
import com.mphasis.firsthibernateapp.model.User;
import com.mphasis.firsthibernetapp.util.HibernateUtil;

public class AppEmployeeDepartments {
	public static void main(String args[])
	{
		EmployeeDAO edao = new EmployeeDAO();
		/*Employee e = new Employee("E1","John",3000000);
		edao.addEmployee(e);
		
		Department d = new Department("D1","Sales");
	    edao.addDepartment(d);*/
		
		edao.assign("E1", "D1");
	    }

}

		
		
		
		
		
		
		
		
		/*Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		
		Department department = new Department("D1","Sales");
		Employee employee = new Employee("E1","Tom",3000000);
		employee.setDepartment(department);
		session.persist(employee);
		session.getTransaction().commit();
		session.close();
		System.out.println("Saved...");*/
	