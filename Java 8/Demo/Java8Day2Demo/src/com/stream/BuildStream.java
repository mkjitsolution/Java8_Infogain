package com.stream;
import java.util.*;
import java.util.stream.*;
class  BuildStream
{
public static void main(String...args)
{
Stream <Integer> l=Stream.of(1,2,45,78);
List<Integer> num=new ArrayList<Integer>();

for(int i=1;i<10;i++)
{
num.add(i);
}

Stream <Integer> s=num.stream();
s.forEach(p->System.out.println(p));
l.forEach(x->System.out.println(x));
}
}