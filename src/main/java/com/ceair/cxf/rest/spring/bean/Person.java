package com.ceair.cxf.rest.spring.bean;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="person")  
public class Person implements Serializable {  
	
	private static final long serialVersionUID = 3102327023820613936L;
	private String id;
    private String name;  
    private int age; 
    
    public Person() {
		super();
	}
	public Person(String id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {  
        return name;  
    }  
    public void setName(String name) {  
        this.name = name;  
    }
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}  
}  
