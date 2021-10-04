package s1;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIDemo {
	
	public static void main(String[] args) {
		
		StreamAPIDemo obj = new StreamAPIDemo();
		
		//obj.basicThings();
		//obj.basicTerminalOperation();
		// obj.doCollectOperation();
		//obj.doCountTerminalOperation();
		//obj.doMinMaxTerminalOperation();
		//obj.doEmployeeMinorMax();
		//obj.doFilterOperation();
		//obj.doThings();
		obj.doMapDemo();
		
	}//end of main
	
	private void doMinMaxTerminalOperation() {
		
		Arrays.asList(15,848,95,62,36).stream().min((x,y)->x.compareTo(y));
		
	}

	private void doCountTerminalOperation() {
		
		long x = Stream.of("dfgerd","dfver","defvre","bfbfgb").count();
		System.out.println(x);
	}

	private void doCollectOperation() {
		
		// 
		List<String> list = Stream.of("dfgerd","dfver","defvre","bfbfgb").collect(Collectors.toList());
	}

	public void basicThings()
	{
		// approach 1 for creating Stream 
		List<Integer> list = new ArrayList<>();
		list.add(15);
		list.add(105);
		list.add(150);
		
		Arrays.asList(15,848,95,62,36);
		
		Stream<Integer> stream = list.stream();
		
		// approach 2 for creating Stream 
		
		Stream<Integer> s = Stream.of(12,20,30,650);
		
		// appraoch 3 
		Stream<Integer> s2 = Arrays.asList(15,848,95,62,36).stream();
		
	}
	
	public void basicTerminalOperation()
	{
		System.out.println(" ------- Approach based on Ayn.. class");
		Stream<Integer> stream = Stream.of(12,20,30,650);
		
		stream.forEach(
		
		new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println(t+100);
				
			}
			
		});

		System.out.println("\n--------Approach based on Lambda Exp ------------\n");
		stream = Stream.of(12,20,30,650);
		stream.forEach((t)->{
			System.out.println(t);
		});
		

		System.out.println("\n--------Approach based on Lambda Exp 2------------\n");
		stream = Stream.of(12,20,30,650);
		stream.forEach((t)->System.out.println(t));
		
		
		
	}
	
	public void doEmployeeMinorMax()
	{
		Employee e1 = new Employee(101, "A", 2000, 8);
		Employee e2 = new Employee(102, "B", 1000, 3);
		Employee e3 = new Employee(103, "C", 22000, 12);
		Employee e4 = new Employee(104, "D", 17000, 18);
		Employee e5 = new Employee(105, "E", 900, 7);
		
		Comparator<Employee> employeeSalaryComparator = (emp1,emp2)->{
			return emp1.getSalary() - emp2.getSalary(); 
		};
		
		//employeeSalaryComparator.compare(e1, e2);
		
		Employee e = Arrays.asList(e1,e2,e3,e4,e5).stream().min(employeeSalaryComparator).get();
		System.out.println(e);
		
	}

	
	public void doFilterOperation()
	{
		/*
		 * List<Integer> list = Stream.of(10,5,48,60,90,30,18,22,14,31).filter((x)->x>15
		 * && x<=30).collect(Collectors.toList());
		 * 
		 * list.stream().forEach((x)->System.out.println(x));
		 */
		
		Employee e1 = new Employee(101, "A", 2000, 8);
		Employee e2 = new Employee(102, "Aab", 1000, 3);
		Employee e3 = new Employee(103, "C", 22000, 12);
		Employee e4 = new Employee(104, "D", 17000, 18);
		Employee e5 = new Employee(105, "AE", 900, 7);
		
		Comparator<Employee> employeeSalaryComparator = (emp1,emp2)->{
			return emp1.getSalary() - emp2.getSalary(); 
		};
		
		//employeeSalaryComparator.compare(e1, e2);
		
		int minSalary  = Arrays.asList(e1,e2,e3,e4,e5).stream()
				       .filter((emp1)->emp1.getName().startsWith("A"))
				       .min(employeeSalaryComparator)
				      .get().getSalary();
		
		
		
	}
	
	public void doThings()
	{
		
		List<Integer> list1 = new ArrayList<>();
		
		
		for (int i = 0; i < 500000; i++) {
			Random random = new Random();
			int x = random.nextInt(200);
			list1.add(x);
		}
		
		System.out.println(" Simple List Start ---->> "+LocalTime.now());
		List<Integer> outputlist1 =  list1.stream().filter((x)->x>20&&x<50).collect(Collectors.toList());
		System.out.println(" Simple List End ---->> "+LocalTime.now());
		
		System.out.println("\n__________________________________________________________________\n");
		
		System.out.println(" Parallel List Start ---->> "+LocalTime.now());
		List<Integer> outputlist2 =  list1.parallelStream().filter((x)->x>20&&x<50).collect(Collectors.toList());
		System.out.println(" Parallel List End ---->> "+LocalTime.now());
		
		
	}

	public void doMapDemo()
	{
		Employee e1 = new Employee(101, "A", 2000, 8);
		Employee e2 = new Employee(102, "Aab", 1000, 3);
		Employee e3 = new Employee(103, "C", 22000, 12);
		Employee e4 = new Employee(104, "D", 17000, 18);
		Employee e5 = new Employee(105, "AE", 900, 7);
		
		Comparator<Employee> employeeSalaryComparator = (emp1,emp2)->{
			return emp1.getSalary() - emp2.getSalary(); 
		};
		
		//employeeSalaryComparator.compare(e1, e2);
		
		List<Employee> empList  = Arrays.asList(e1,e2,e3,e4,e5).stream()
				.filter((emp1)->emp1.getName().startsWith("A"))
				.map((emp)->{
					int oldSalary = emp.getSalary();
					int newSalary = oldSalary+1000;
					emp.setSalary(newSalary);
					return emp;
				}).collect(Collectors.toList());
				       
		empList.stream().forEach((e)->System.out.println(e));
	}

	
	public void doReduce()
	{
		int total = Stream.of(15,4,48,96,21,36).reduce(0,(sum,x)->sum+=x);
		System.out.println(total);
		
		Employee e1 = new Employee(101, "A", 2000, 8);
		Employee e2 = new Employee(102, "Aab", 1000, 3);
		Employee e3 = new Employee(103, "C", 22000, 12);
		Employee e4 = new Employee(104, "D", 17000, 18);
		Employee e5 = new Employee(105, "AE", 900, 7);
		
		//
		//int totalSalary = Arrays.asList(e1,e2,e3,e4,e5).stream();
		
	}
	

}//end of class























