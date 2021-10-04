package com.functionalinterfacedemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
class ConsumerImpl implements Consumer<Integer>
{

	@Override
	public void accept(Integer t) {
		System.out.println(t);
		
	}
	
}
public class ConsumerDemo {
	public static void main(String[] args) {
		List<Integer> al= Arrays.asList(20,30,90);
		Consumer<Integer> c=new ConsumerImpl();
        al.forEach(c);
	}

}
