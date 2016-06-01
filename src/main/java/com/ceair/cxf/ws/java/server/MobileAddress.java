package com.ceair.cxf.ws.java.server;

import javax.jws.WebService;
import javax.xml.ws.BindingType;

//sei的接口
@WebService
//版本指定为1.2，如果客户端发1.1协议，服务端会自动降级
@BindingType(value=javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public interface MobileAddress {
	//根据手机号查询归属地
	public String getAddressByMobile(String strMobile);
	

}
