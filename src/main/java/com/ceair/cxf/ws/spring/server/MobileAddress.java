package com.ceair.cxf.ws.spring.server;

import javax.jws.WebService;
import javax.xml.ws.BindingType;

//sei的接口
@WebService
@BindingType(value=javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public interface MobileAddress {
	//根据手机号查询归属地
	public String getAddressByMobile(String strMobile);
	

}
