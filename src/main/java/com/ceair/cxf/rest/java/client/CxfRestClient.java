package com.ceair.cxf.rest.java.client;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.cxf.jaxrs.client.WebClient;

import com.ceair.cxf.rest.java.bean.User;

public class CxfRestClient {

	public static void main(String[] args) {
		WebClient client = WebClient.create("http://localhost:8080/");
		User user = client.path("userservice/user/001").accept("application/xml").get(User.class);
        System.out.println(ReflectionToStringBuilder.toString(user));
	}
}
