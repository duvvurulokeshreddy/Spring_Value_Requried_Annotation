package com.jsp.spring.Spring.loadingProperties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("Bean is loaded");
    	ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
    	Student stud=context.getBean("student",Student.class);
    	stud.displayStudentInfo();
    }
}
