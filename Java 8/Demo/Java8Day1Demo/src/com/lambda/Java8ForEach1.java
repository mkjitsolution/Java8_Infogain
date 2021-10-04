package com.lambda;
import java.util.*;
import java.util.function.*;
/*class ConsImpl implements Consumer<Integer>{

public void accept(Integer i)
{
System.out.println(i);
}
}*/
class Java8ForEach1
{
public static void main(String... args)
{
List<Integer> al=Arrays.asList(23,45,67,70);
System.out.println("By Lambda ");
//al.forEach(i->System.out.print(i+" "));//This line is implementation of Consumer interface so it is an object of consumer
//Consumer c=new ConsImpl();
//using annonmyous class
Consumer<Integer> c=new Consumer<Integer>()
{
public void accept(Integer i)
{
System.out.println(i);
}
};
//Consumer<Integer> c=(Integer i)->System.out.println(i);
al.forEach(c);
//al.forEach(i->System.out.println(i));
}
}