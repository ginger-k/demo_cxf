package com.ceair.cxf.ws.java.server;



public class MobileAddressImpl implements MobileAddress {

	@Override
	public String getAddressByMobile(String strMobile) {
		//实际业务开发中，我们会根据传过来的手机号码到数据库查询。
		//这里直接写死
		//.....
		String strResult=strMobile+"归属地是上海";
		
		return strResult;
	}

}
