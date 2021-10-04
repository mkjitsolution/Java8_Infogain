package com.defaultmethoddemo;
interface Person1 {
	default void sayHello() {
		System.out.println("Hello");
	}
}
interface Male{
	default void sayHello() {
		System.out.println("Hi Sam");
	}
}
class Sam1 implements Person1, Male {

// sol must override the method

public void sayHello() {
		System.out.println("Hi Rita");
		Male.super.sayHello();//call Male Interface method
}
}

public class DefAndMultiInh
{
public static void main(String args[])
{
 Sam1 s=new Sam1();
 s.sayHello();
 

}
}