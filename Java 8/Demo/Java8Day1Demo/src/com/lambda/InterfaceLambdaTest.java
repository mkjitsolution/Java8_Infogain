package com.lambda;

interface A
{
void show();
//void disp();
}


/*class Xyz implements A
{
public void show()
{
System.out.println("Hello...");
}
}*/

class InterfaceLambdaTest
{
public static void main(String...args)
{
/*Xyz x=new Xyz();
x.show();*/
/*A obj=new A()
{
public void show()
{
System.out.println("Hello...");
}
};*/

A obj=()->System.out.println("Hello...");///This line is implementation of Interface A
obj.show();
}
}