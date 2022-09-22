package com.coll.demo;

public class Teacher {
	
	String name="Naveen";
	int age=21;
	
	Teacher(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	@Override
	public String toString() {
		
		return "name="+name + ", age="+ age;
	}

}
