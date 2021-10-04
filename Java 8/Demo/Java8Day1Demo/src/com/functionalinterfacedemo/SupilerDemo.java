package com.functionalinterfacedemo;

import java.util.function.Supplier;

public class SupilerDemo {

	public static void main(String[] args) {
		
		// Supplier returning the object of class.Use class name and new keyword while creating supplier. 
		//Call Supplier.get() and we will get object of that class
		
		
		Supplier<Employee> supplier = Employee::new;
		
       // Return the object
		Employee emp = supplier.get();
        emp.setName("Ravic");
        System.out.println(emp.getMsg());

        //Supplier to call static method of a class
        Supplier<String> supplier1 = Employee::greet;
        
        //This will return the value of greet method
        String val=supplier1.get();
        System.out.println(" Greet Method Returned value is  "+val);
        

	}

}
