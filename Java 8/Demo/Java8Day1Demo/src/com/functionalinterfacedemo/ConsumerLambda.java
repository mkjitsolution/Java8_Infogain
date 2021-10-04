package com.functionalinterfacedemo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerLambda {
	public static void main(String[] args) {
		List<String> mylist=Arrays.asList("Ravic","Rohit");
	Consumer<String> c=(String i)->System.out.println(i);
	 mylist.forEach(c);
	}

}
