package com.ceair.cxf.rest.spring.client;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.cxf.jaxrs.client.WebClient;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ceair.cxf.rest.spring.bean.Person;

public class Client {

	public static void main(String[] args) {
		//得到上下文
		@SuppressWarnings("resource")
		ApplicationContext ac = new ClassPathXmlApplicationContext("cxf-rs-client.xml");
		WebClient client = (WebClient)ac.getBean("webClient");
		Person person = client.path("personservice/person/001").accept("application/xml").get(Person.class);
		System.out.println(ReflectionToStringBuilder.toString(person));
	}
}
