package com.mphasis.firsthibernateapp;
import org.hibernate.Session;

import com.mphasis.firsthibernateapp.dao.ContactDAO;
import com.mphasis.firsthibernateapp.model.Contact;
import com.mphasis.firsthibernateapp.util.HibernateUtil;

public class App {

	public static void main(String args[])
	{	
		ContactDAO contactDAO = new ContactDAO();
		Contact c = new Contact("c2","Shrini","Shrini@gmail.com");
		if(contactDAO.save(c))
			System.out.println(c.getId()  + "Saved....");
		
	}
	
}





	/*	//save();
		//findById("c1");
		//del("c2");
		updateEmail("c1", "jai1@gmail.com");
		
	}
	public static void save() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Contact c = new Contact("c1","jai","jai@gmail.com");
		session.persist(c);
		session.getTransaction().commit();
		session.close();
		System.out.println("Saved");
		
	}
	public static void findById(String id) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Contact c = session.find(Contact.class, id);
		System.out.print(c.getId()+","+c.getName()+","+c.getEmail());
		
		session.getTransaction().commit();
		session.close();
		System.out.println(id + "updated");
	}
	public static void del(String id) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Contact c = session.find(Contact.class,id);
		session.remove(c);
		session.getTransaction().commit();
		session.close();
		System.out.println(id +"deleted");
		
	}
	public static void updateEmail(String id, String newemail) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Contact c = session.find(Contact.class,id);
		c.setEmail(newemail);
		session.persist(c);
		session.getTransaction().commit();
		session.close();
		System.out.println(id +"updated");*/
		
