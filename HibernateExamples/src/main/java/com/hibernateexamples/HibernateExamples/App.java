package com.hibernateexamples.HibernateExamples;

import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class App 
{
    public static void main( String[] args )
    {
    	
    	StudentFullName sfn=new StudentFullName();//created object for studentfullname class
    	sfn.setFname("Malladi");
    	sfn.setMname("Sahithi");
    	sfn.setLname("Reddy");
        StudentDetails s=new StudentDetails();//created object for student details class
        s.setId(1);
        s.setSfn(sfn);
        s.setAdress("mncl");
        
        Configuration con=new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sf=con.buildSessionFactory();
        Session session=sf.openSession();
        session.beginTransaction();
        session.save(s);
        
        //s=(StudentDetails)session.get(StudentDetails.class, 1);//fetching the details of the student
  
        session.getTransaction().commit();
        
        //System.out.println(s);
        session.close();
        sf.close();
    }
}
