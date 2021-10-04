package com.defaultmethoddemo;
interface Person2 {
	default void sayHello() {
		System.out.println("Hello sam");
	}

	static void age()
	{
	System.out.println("20");
	}
}
class StaticMethodDemo implements Person2 {
/*@Override
public static void age()
{
}*/
}

class StaticMethod
{
public static void main(String args[])
{
 StaticMethodDemo s=new StaticMethodDemo();
 s.sayHello();
 Person2.age();//calling static method
 }
}