package com.ceair.cxf.ws.java.client;

import org.apache.cxf.binding.soap.Soap12;
import org.apache.cxf.binding.soap.SoapBindingConfiguration;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.ceair.cxf.ws.java.client.stub.MobileAddress;



//cxf客户端测试
//生产stub：wsdl2java -d . -p com.ceair.cxf.ws.java.client.stub http://127.0.0.1:8888/mobile?wsdl
public class CxfClient {

	public static void main(String[] args) {
		//1.实例化本地代理工厂
		JaxWsProxyFactoryBean pf= new JaxWsProxyFactoryBean();
		//2.在工厂上设置属性：
		//两个属性：1.ws地址，2.桩代理类
		pf.setAddress("http://127.0.0.1:8888/mobile");
//		pf.setServiceClass(MobileAddress.class);
		
		//日志拦截器
		//输入拦截器里面加入输入日志拦截器类
		pf.getInInterceptors().add(new LoggingInInterceptor());
		//输出拦截器里面加入输出日志拦截器类
		pf.getOutInterceptors().add(new LoggingOutInterceptor());
		
		//设置客户端soap调用的版本为1.2
		SoapBindingConfiguration sbc = new SoapBindingConfiguration();//soap的配置
		sbc.setVersion(Soap12.getInstance());//设置soap的版本
		pf.setBindingConfig(sbc);//工厂绑定配置
		
		//3.创建工厂得到代理类的实例
//		MobileAddress ma =(MobileAddress) pf.create();
		MobileAddress ma = pf.create(MobileAddress.class);
		
		//得到数据并打印
		System.out.println(ma.getAddressByMobile("15712636227"));
	}

}
