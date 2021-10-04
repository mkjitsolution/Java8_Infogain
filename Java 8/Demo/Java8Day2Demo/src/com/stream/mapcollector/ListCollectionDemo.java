package com.stream.mapcollector;

import java.util.stream.*;
import java.util.*;
public class ListCollectionDemo {
     public static void main(String[] args){
	 	 List<Integer> list = new ArrayList<Integer>();
         for(int i = 1; i< 10; i++){
             list.add(i);
         }
 	
     Stream<Integer> stream = list.stream();
     
	List<Integer> ls=stream.collect(Collectors.toList());
		 Iterator itr=ls.iterator();
		 while(itr.hasNext())
		 {
		 System.out.println(itr.next());
		 }
	
		 Stream<Integer> stream1 = list.stream();
	
List<Integer> evenNumbersList = stream1.filter(i -> i%2 == 0).collect(Collectors.toList());
         System.out.print(evenNumbersList);
        
            // Count the empty strings
             List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg", "jk");
              
             // Remove all empty Strings from List
             List<String> filtered = strList.stream().filter(x -> !x.isEmpty()).collect(Collectors.toList());
             System.out.println(filtered);

         
     
     }
}
