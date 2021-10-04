package com.defaultmethoddemo;
interface Person {
	//adds a java 8 default method
	default public void sayHello() {
		System.out.println("Hello there!");
}
public void print();

}

class Sam implements Person {
	public void print()
	{
		System.out.println("Print called...");
	}
}

public class DefaultMethod {
	public static void main(String [] args) {
			Sam sam = new Sam();
		
		//calling sayHello method calls the method
		//defined in interface
		sam.sayHello();
		sam.print();
	}
}
