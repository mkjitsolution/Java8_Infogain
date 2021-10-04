package com.stream.reduce;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
 
public class StreamReduceExample {
 public static void main(String[] args) {
final List<Integer> numbers = Arrays.asList(20,30,50);		
int sum = numbers.stream().reduce(0,(num1,num2) -> num1+num2);
 System.out.println("Sum is " + sum);
     }
 }
 