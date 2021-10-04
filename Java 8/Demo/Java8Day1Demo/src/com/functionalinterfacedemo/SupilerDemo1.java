package com.functionalinterfacedemo;

import java.util.function.Supplier;

public class SupilerDemo1 {
	// Invokes the greet() method on the instance of Person or Student:
	static void greetPerson(Supplier<? extends Person> supplier){
	    Person p = supplier.get();
	    p.greet();
	  }
	public static void main(String[] args) {
		
		
	/*Provide an implementation of the Supplier interface
	 by passing a lambda expression.*/
		
		//Using Lambda expression
		greetPerson(()-> new Person());
		greetPerson(()-> new Student());
		   
		  //Using constructor method reference
		greetPerson(Person::new);
		greetPerson(Student::new);


	}

}
