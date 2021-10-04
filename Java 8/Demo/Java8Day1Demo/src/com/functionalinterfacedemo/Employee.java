package com.functionalinterfacedemo;

public class Employee {
		String name;
	   
		public Employee() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

    public static String greet(){
        return "Welcome to infogain";
    }
    public String getMsg(){
        return "Hello!! "+name;
    }

	

}
