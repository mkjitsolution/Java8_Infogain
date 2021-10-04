package com.functionalinterfacedemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumerdemo1 {

	public static void main(String[] args) {
		List<String> mylist=Arrays.asList("Ravic","Rohit");
		Consumer<String> cons= new Consumer<String>() 
		{

			@Override
			public void accept(String t) {
				System.out.println(t);
				
			}
		
		};
		 mylist.forEach(cons);

	}

}
