package com.saksham.project1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
    	ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
    	Vehicle obj=(Vehicle) context.getBean("Vehicle");
    	obj.Drive();
    	
    }
}
