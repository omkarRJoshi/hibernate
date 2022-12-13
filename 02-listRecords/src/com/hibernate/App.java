package com.hibernate;

import java.util.List;

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
			listUsers(session);
		} finally {
			session.close();
			factory.close();
		}
	}
	
	private static void listUsers(Session session) {
		
//		start transaction
		session.beginTransaction();
		
		List<Users> users = session.createQuery("from users").getResultList();
		
		for(Users user: users) {
			System.out.println(user);
		}
	}
	
}
