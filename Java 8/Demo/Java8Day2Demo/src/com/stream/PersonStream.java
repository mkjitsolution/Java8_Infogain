package com.stream;

import java.util.*;
import java.util.stream.*;

public class PersonStream {

	public static void main(String[] args) {
		List<Person> p=new ArrayList<Person>();
		p.add(new Person("Ravic"));
		p.add(new Person("Amit"));
		Stream<Person> ps=p.stream();
		ps.forEach(x->System.out.println(x.getName()));

	}

}
