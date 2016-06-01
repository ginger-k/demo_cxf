package com.ceair.cxf.rest.spring.server;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.ceair.cxf.rest.spring.bean.Person;


/* 
 * http://localhost:8080/rs/personservice/person/001 id为001的用户, 
*/ 
@Produces({"application/xml"})  
public class PersonService {  
      
    @GET  
    @Path("/person/{id}")  
    @Consumes({"application/xml"})  
    public Person getPerson(@PathParam("id")String id ) {  
        System.out.println("获取ID为  " + id + " 的用户");
        return new Person(id, "miss徐", 18);
    }  
    
}  
