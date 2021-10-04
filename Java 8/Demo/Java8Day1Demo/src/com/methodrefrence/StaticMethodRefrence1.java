package com.methodrefrence;

import java.util.function.*;
import java.util.*;
class StaticMethodRefrence1
{
public static void main(String... args)
{
List<Integer> al=Arrays.asList(0,2,3,5,8,10);
//using lambda expression
//List<Integer> evenList=StaticMethodRefrence1.testPredicate(al,x->StaticMethodRefrence1.isEven(x));
//using   static method reference

List<Integer> evenList=StaticMethodRefrence1.testPredicate(al,StaticMethodRefrence1::isEven);
evenList.forEach(i->System.out.println(i));
}

public static boolean isEven(Integer x)
{
return(x%2==0);
}

public static List<Integer> testPredicate(List<Integer> list,Predicate<Integer> predicate)
{
List<Integer> returnlist=new ArrayList();
for(Integer x:list)
{
if(predicate.test(x))
returnlist.add(x);
}
return returnlist;
}
}