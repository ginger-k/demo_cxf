package com.ceair.cxf.ws.java.server;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

//cxf服务端
public class CxfServer {

	//不要用maven的依赖，因为需要jetty
	//build path maven denpendencies remove
	//build path 添加 add libraries CXF Runtime
	// 测试后 删除 cxf， maven update
	public static void main(String[] args) {
		//1.实例化一个服务端的工厂
		JaxWsServerFactoryBean sf = new JaxWsServerFactoryBean();
		//2.在工厂上设置3个属性值：ws地址，sei接口类，sei实现类
		sf.setAddress("http://127.0.0.1:8888/mobile");
		sf.setServiceClass(MobileAddress.class);
		sf.setServiceBean(new MobileAddressImpl());
		
		//日志拦截器
		//输入拦截器里面加入输入日志拦截器类
		sf.getInInterceptors().add(new LoggingInInterceptor());
		//输出拦截器里面加入输出日志拦截器类
		sf.getOutInterceptors().add(new LoggingOutInterceptor());
		
		//3.创建工厂并发布，使用内置容器jetty
		sf.create();
		System.out.println("服务发布完成！");
	}

}
