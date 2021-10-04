package com.functionalinterfacedemo;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
public class PredicateTest {
	public static void condition(List<Integer> list, Predicate<Integer> predicate) {
		for(Integer n: list)  {
		if(predicate.test(n)) {
		System.out.println(n + " ");
		}
		}
		}
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, -5, -6, 7);
		 Predicate<Integer> positive = i -> i > 0;
		 //condition(list,positive);
		 condition(list,i->i>0);
		 
		 // TODO Auto-generated method stub
    /*list.forEach((i)->System.out.println(i));
    list.forEach(System.out::println);*/
		 System.out.println("Print all numbers:");
		 condition(list, (n)->true);
	 
		 System.out.println("Print no numbers:");
		 condition(list, (n)->false);
		  
		 System.out.println("Print even numbers:");
		 condition(list, (n)-> n%2 == 0 );
		 
		 System.out.println("Print odd numbers:");
		 condition(list, (n)-> n%2 == 1 );
		 
		 System.out.println("Print numbers greater than 5:");
		 condition(list, (n)-> n > 5 );
	}
}
