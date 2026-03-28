package com.mphasis.firsthibernateapp.dao;

import org.hibernate.Session;

import com.mphasis.firsthibernateapp.model.BlogPost;
import com.mphasis.firsthibernateapp.model.Comment;
import com.mphasis.firsthibernateapp.util.HibernateUtil;

public class BlogPostDAO {
	
	public boolean addBlog(BlogPost blogpost) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.persist(blogpost);
		session.getTransaction().commit();
		session.close();
		System.out.println(blogpost.getId() + "Saved...");
		return true;
	}
	
	public boolean addComment(String blogid, Comment comment) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		BlogPost blogpost = session.find(BlogPost.class,blogid);
		blogpost.getComments().add(comment);
		comment.setBlogpost(blogpost);
		session.persist(blogpost);
		session.getTransaction().commit();
		session.close();
		System.out.println("Saved...");
		return true;
	}
	
	
}
