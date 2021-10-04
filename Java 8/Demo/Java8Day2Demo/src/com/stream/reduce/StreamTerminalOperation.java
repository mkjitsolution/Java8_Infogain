package com.stream.reduce;
import java.util.*;
import java.util.stream.*;
class StreamTerminalOperation
{
public static void main(String...args)
{
List<String> memberNames = new ArrayList<>();
memberNames.add("Amit");
memberNames.add("Shekhar");
memberNames.add("Aman");
memberNames.add("Rahul");
memberNames.add("Yana");
memberNames.add("Lokesh");
memberNames.add("Sanchit");
boolean matchedResult = memberNames.stream()
                    .anyMatch((s) -> s.startsWith("A"));
System.out.println(matchedResult);


String firstMatchedName = memberNames.stream()
                .filter((s) -> s.startsWith("S"))
                .findFirst().get();
 
System.out.println(firstMatchedName);
}
}
