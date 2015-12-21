package com.youngjee.hibernate;

import java.util.Date;

import javax.persistence.GeneratedValue;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTest {
	public static void main(String[] args) {
		Student_Info student_Info = new Student_Info();
		
		student_Info.setName("marry");
//		student_Info.setRollNo(8);   @GeneratedValue ������̼��� ������ ��� �ʿ� ����
		student_Info.setAge(30);
		student_Info.setBirthDate(new Date());
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		
		session.save(student_Info);
		
		session.getTransaction().commit();
		session.close();
		factory.close();
		
	}

}
