package com.youngjee.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CrudWithHibernate {

	public static void main(String[] args) {
		
		StudentOther studentOther = new StudentOther();
		studentOther.setStudent_name("Scrapy");
		
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		
//		insert
//		session.save(studentOther);
		
//		read
		StudentOther readStudentOther = (StudentOther)session.get(StudentOther.class, 13);
		System.out.println("read:"+readStudentOther.getStudent_name());
		
		readStudentOther.setStudent_name("name is update scrapyssssss!!!");
		session.update(readStudentOther);
		
//		session.delete(readStudentOther);
		
		session.getTransaction().commit();
		session.close();
//		factory.close();
		
	}

}
