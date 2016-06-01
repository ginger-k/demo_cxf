package com.ceair.cxf.rest.java.server;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.ceair.cxf.rest.java.bean.User;


/* * http://localhost:8080/userservice 为入口， 
 * http://localhost:8080/userservice/user 为用户列表, 
 * http://localhost:8080/userservice/user/001 id为001的用户, 
*/ 
@Path("/userservice")  
@Produces({"application/xml", "application/json"})  
public class UserService {  
      
    @GET  
    @Path("/user/{id}")  
    @Consumes({"application/xml"})  
    public User getUser(@PathParam("id")String id ) {  
        System.out.println("获取ID为  " + id + " 的用户");
        return new User(id, "miss徐", 18);
    }  
    
}  
