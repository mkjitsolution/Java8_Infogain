package com.stream.mapcollector;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
public class MapCollectorDemo {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(101, "Amit"));
		list.add(new Employee(102, "Ravic"));
		list.add(new Employee(103, "Ravi"));
		Map<Integer, String> map = list.stream()
		.collect(Collectors.toMap(Employee::getId, Employee::getName));
	map.forEach((x, y) -> System.out.println("Key: " + x +", value: "+ y));
	}

	}


