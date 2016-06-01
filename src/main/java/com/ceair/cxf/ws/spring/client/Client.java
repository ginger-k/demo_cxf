package com.ceair.cxf.ws.spring.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ceair.cxf.ws.spring.client.stub.MobileAddress;



public class Client {
	
	//生产stub：wsdl2java -d . -p com.ceair.cxf.ws.spring.client.stub http://localhost:8080/ws/mobile?wsdl
	public static void main(String[] args) {
		//得到上下文
		@SuppressWarnings("resource")
		ApplicationContext ac = new ClassPathXmlApplicationContext("cxf-ws-client.xml");
		//得到bean---桩的实例，代理对象
		MobileAddress ma = (MobileAddress)ac.getBean("client");
		//调用代理对象的方法得到数据
		System.out.println(ma.getAddressByMobile("15712636227"));
	}


}
