package com.ceair.cxf.rest.java.server;

import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;

import com.ceair.cxf.rest.java.bean.User;

public class CxfRestServer {

	//不要用maven的依赖，因为需要jetty
	//build path maven denpendencies remove
	//build path 添加 add libraries CXF Runtime
	// 测试后 删除 cxf， maven update
	public static void main(String[] args) {
        JAXRSServerFactoryBean restServer = new JAXRSServerFactoryBean();  
        restServer.setResourceClasses(User.class);  
        restServer.setServiceBean(new UserService());  
        restServer.setAddress("http://localhost:8080/");  
        restServer.create(); 
        System.out.println("restfull服务发布完成！");
	}
}
