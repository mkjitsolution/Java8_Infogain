package p7;

import java.util.function.Predicate;

import p6.Addressable;

public class MyClass2 {
	
	public MyClass2() {
		System.out.println("MyClass 2 Constructor");
	}
	
	
	public boolean doCheck(int marks)
	{
		if(marks>50 && marks<=100)
		{
			return true;
		}
		else return false;
	}

	public static void main(String[] args) {
		Addressable a = MyClass2::new;
		a.doSomeThing();
		
		MyClass2 obj = new MyClass2();
		
		Predicate<Integer> p = obj::doCheck;
		boolean status = p.test(85);
		System.out.println(status);
		
	}
}
