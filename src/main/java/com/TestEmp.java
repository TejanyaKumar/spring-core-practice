package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmp {
	
	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("beans.xml");
		Employee emp1 = container.getBean("emp1" , Employee.class);
		System.out.println(emp1);
		Employee emp2 = container.getBean("emp2" , Employee.class);
		System.out.println(emp2);			
	}

}
