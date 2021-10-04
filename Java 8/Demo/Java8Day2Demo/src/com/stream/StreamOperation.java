package com.stream;

import java.util.*;
import java.util.stream.*;
class StreamOperation
{
public static void main(String...args)
{
List<String> memberNames = new ArrayList<>();
memberNames.add("Amitabh");
memberNames.add("Shekhar");
memberNames.add("Aman");
memberNames.add("Rahul");

Stream<String> mname=memberNames.stream();

System.out.println("Filter Operation.....");
mname.filter((s) -> s.startsWith("A"))
                    .forEach(i->System.out.println(i));
/*
System.out.println("Filter Operation.....");
mname.filter((s) -> s.startsWith("A"))
                    .forEach(System.out::println);*/


System.out.println("Map Example......");
memberNames.stream().filter((s) -> s.startsWith("A")).map(String::toUpperCase)
.forEach(System.out::println);

System.out.println("Sorting Example......");
memberNames.stream().sorted().map(String::toUpperCase).forEach(System.out::println);

//Count the empty strings
List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg", "jk");
long count = strList.stream().filter(x -> x.isEmpty()).count();
System.out.printf("List %s has %d empty strings %n", strList, count);

// Count number of String which startswith "a"
count = strList.stream().filter(x -> x.startsWith("a")).count();
System.out.printf("List %s has %d strings which startsWith 'a' %n", strList, count);



}
}
