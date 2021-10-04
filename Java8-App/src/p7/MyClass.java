package p7;

import p6.Addressable;

public class MyClass {

	public void method1()
	{
		System.out.println(" inside method 1 of MyClass");
	}
	
	public static void main(String[] args) {
		
		MyClass obj = new MyClass();
		obj.method1();
		
		Addressable a = obj::method1;
		a.doSomeThing();
		
	}
}
