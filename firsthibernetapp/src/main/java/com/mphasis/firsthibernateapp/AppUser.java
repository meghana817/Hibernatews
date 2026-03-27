package com.mphasis.firsthibernateapp;

import org.hibernate.Session;

import com.mphasis.firsthibernateapp.model.Address;
import com.mphasis.firsthibernateapp.model.User;
import com.mphasis.firsthibernetapp.util.HibernateUtil;

public class AppUser {
	public static void main(String args[])
	{
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Address address = new Address("Kharadi bypass","pune","411037");
		User user = new User("u1", "jerry",address);
		session.persist(user);
		session.getTransaction().commit();
		session.close();
		System.out.println("Saved...");
	}

}
