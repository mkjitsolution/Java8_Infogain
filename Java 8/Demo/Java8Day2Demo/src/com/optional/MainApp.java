package com.optional;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MainApp {

	public static void main(String[] args) {
	Optional<Employee> e=Optional.of(new Employee());
	String ename = e.map(Employee::getName).orElse("Object Not Initialized");
	System.out.println(ename);
	
		
		Optional<Employee> e1=Optional.of(new Employee("Ravic"));
		String ename1=e1.map(Employee::getName).get();
		System.out.println(ename1);
		
		
        /*Optional<Employee> em = Optional.of(new Employee("Amit singh"));
        //Using Optional.filter
        Predicate<Employee> as = p-> p.getName().length() < 5;
        System.out.println(em.filter(as));

      //Using Optional.ifPresent
       Consumer<Employee> empConsumer = (Employee p) -> System.out.println(p.getName());
        em.ifPresent(empConsumer);

*/   
	}

}
