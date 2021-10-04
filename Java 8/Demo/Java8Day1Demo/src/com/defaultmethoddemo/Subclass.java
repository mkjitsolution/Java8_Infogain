package com.defaultmethoddemo;

public class Subclass extends Base{
	
	//@Override
	public void showMethod()
	{
		
		System.out.println("Hello...Overide");
		super.showMethod();
	}
	

	public static void main(String[] args) {
		Subclass s=new Subclass();
		s.showMethod();
		
	}

}
