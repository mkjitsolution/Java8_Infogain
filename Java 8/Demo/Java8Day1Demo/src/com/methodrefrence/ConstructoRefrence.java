package com.methodrefrence;

import java.util.function.*;
import java.util.*;

class ConstructoRefrence
{
public static void main(String... args)
{

List<Integer> al=Arrays.asList(1,2,3,5,8,10);
//by lambda
//List<Double> doublelist=ConstructoRefrence.applyFunction(al,x->new Double(x));
// by constructor reference


List<Double> doublelist=ConstructoRefrence.applyFunction(al,Double::new);
System.out.println("Double numbers "+doublelist);
}

public static List<Double> applyFunction(List<Integer> list,Function<Integer,Double> function)
{
List<Double> returnlist=new ArrayList();
list.forEach(x->returnlist.add(function.apply(x)));
return returnlist;
}
}