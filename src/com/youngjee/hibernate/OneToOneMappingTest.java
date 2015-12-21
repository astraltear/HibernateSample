package com.youngjee.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class OneToOneMappingTest {

	public static void main(String[] args) {
		Student student = new Student();
		student.setStudent_name("OneToOne");
		
		StudentDetail studentDetail = new StudentDetail();
		studentDetail.setStudent_mobile_number("010-2222-3333");
		
		studentDetail.setStudent(student);
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		
		session.save(studentDetail);
		
		session.getTransaction().commit();
		session.close();
		factory.close();
	}

}
