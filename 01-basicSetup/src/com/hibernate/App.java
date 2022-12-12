package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Users;

public class App {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
										.configure("hibernate.cfg.xml")
										.addAnnotatedClass(Users.class)
										.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
//			createUser(session);
//			readUser(session, 1);
//			updateUser(session, 1);
//			deleteUser(session, 3);
				
		} finally {
			session.close();
			factory.close();
		}
	}
	
	private static void createUser(Session session) {

//		create object of entity class
		Users user = new Users("userName", "password", "firstName", "lastName");
//		start transaction
		session.beginTransaction();
//		perform operation
		session.save(user);
//		commit the transaction
		session.getTransaction().commit();
		
		System.out.println("Row added");
	}
	
	private static void readUser(Session session, int userId) {

//		create object of entity class
		Users user = new Users();
//		start transaction
		session.beginTransaction();
//		perform operation
		user = session.get(Users.class, userId);
//		commit the transaction
		session.getTransaction().commit();
		
		System.out.println(user);
	}
	
	
	private static void updateUser(Session session, int userId) {

//		create object of entity class
		Users user = new Users();
//		start transaction
		session.beginTransaction();
//		perform operation
		user = session.get(Users.class, userId);
		user.setFirstName("Omkar");
//		commit the transaction
		session.getTransaction().commit();
		
		System.out.println(user);
	}
	
	private static void deleteUser(Session session, int userId) {

//		create object of entity class
		Users user = new Users();
//		start transaction
		session.beginTransaction();
//		perform operation
		user = session.get(Users.class, userId);
//		delete a record with user id 8
		session.delete(user);
//		commit the transaction
		session.getTransaction().commit();
		
		System.out.println(user);
		System.out.println("user with user id: " + user.getUserId() + " is deleted");
	}
	
}
