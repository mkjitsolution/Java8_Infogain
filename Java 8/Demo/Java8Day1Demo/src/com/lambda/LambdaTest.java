package com.lambda;
 @FunctionalInterface
 interface MathOperation 
  {
      int operation(int a, int b);
	 //void add();
   }
   @FunctionalInterface
   interface MathOperation1
   {
   int sub(int x,int y);
      }
	 
	 @FunctionalInterface
   interface Printable
   {
   void disp();
     }
	
public class LambdaTest
{
public static void main(String args[])
{
    
  MathOperation1 s1 = (a, b) -> a - b;
			  
  
   	   MathOperation m = (int a, int b) -> 
	   { 
	   return a * b; 
	   };
	   
Printable p= () -> System.out.println("My Lambda Test");	   
int res=m.operation(20,30);
p.disp();
System.out.println("Result is "+res);
System.out.println("Without Type Declaration and substract method "+s1.sub(30,10));
}
}