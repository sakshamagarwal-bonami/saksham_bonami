package com.saksham.autowiringxml.Autowiring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		ApplicationContext context=new ClassPathXmlApplicationContext("com/saksham/autowiringxml/Autowiring1");
		Employee employee1=(Employee) context.getBean("employee1");
		System.out.print(employee1);
	}

}
