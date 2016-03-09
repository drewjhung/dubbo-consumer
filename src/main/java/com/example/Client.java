package com.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.service.UserService;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(    
	              new String[]{"application-consumer.xml"});    
	          
	        UserService us = (UserService)context.getBean("userService");  
	        System.out.println(us.findById(1));  
	}

}
