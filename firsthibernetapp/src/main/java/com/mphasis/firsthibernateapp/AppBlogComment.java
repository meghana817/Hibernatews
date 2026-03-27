package com.mphasis.firsthibernateapp;

import org.hibernate.Session;

import com.mphasis.firsthibernateapp.dao.BlogPostDAO;
import com.mphasis.firsthibernateapp.model.BlogPost;
import com.mphasis.firsthibernateapp.model.Comment;
import com.mphasis.firsthibernateapp.model.Customer;
import com.mphasis.firsthibernateapp.model.Locker;
import com.mphasis.firsthibernetapp.util.HibernateUtil;

public class AppBlogComment {
	public static void main(String args[]) {
		//save();
		testblog();
	}
	private static void save() {
	Session session = HibernateUtil.getSessionFactory().getCurrentSession();
	session.beginTransaction();
	BlogPost blog = new BlogPost("B1","Spring AI","Spring AI is an appliction framework"
			+"It simplifies the integration of artificial"
			+"Java applications","Josh Long");
	
	Comment c1 = new Comment("c1", "Nice..!!", "Tom");
	Comment c2 = new Comment("c2", "Nice..!!", "Sam");
	
	c1.setBlogpost(blog);
	c2.setBlogpost(blog);
	
	blog.getComments().add(c1);
	blog.getComments().add(c2);


	session.persist(blog);
	session.getTransaction().commit();
	session.close();
	System.out.println("Saved...");

}
private static void testblog() {
		
		BlogPostDAO blogpostDAO = new BlogPostDAO();
		BlogPost blog = new BlogPost("B2", "Spring with K8","Spring with K8","Josh Long");
		blogpostDAO.addBlog(blog);
		
		Comment comment = new Comment("C3","Good Point","James");
		blogpostDAO.addComment("B2", comment);
	}
}
