package com.lambda;
import java.util.*;
class Java8ForEach
{
public static void main(String... args)
{
List<Integer> al=Arrays.asList(23,45,67);
System.out.println("By For loop ");
for(int i=0;i<al.size();i++)
{
System.out.println(al.get(i));

}
System.out.println("By For Each  loop ");
for(int i:al)
{
System.out.print(i+" ");
}
System.out.println("By Lambda ");

al.forEach(i->System.out.println(i));//This line is implementation of Consumer interface so it is an object of consumer

}

}