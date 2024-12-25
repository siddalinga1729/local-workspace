package practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsInStreams {
	public static void main(String[] args) {
		List<Employee> emp = Arrays.asList(new Employee(1, "siddu", "linga", "DEV"),
				new Employee(2, "Mouni", "DN", "TES"), new Employee(3, "Nari", "DM", "HR"),
				new Employee(5, "siddu", "linga", "DEV"), new Employee(5, "Uma", "linga", "DEV"));
//		System.out.println(emp.stream().map(e -> e.getFirstName()).
//				collect(java.util.stream.Collectors.joining(", ")));
		
//		List<Employee> collect = emp.stream().filter(x->x.getId()>2).collect(Collectors.toList());
//		System.out.println(collect);
		
//		System.out.println(
//		emp.stream().collect(Collectors.partitioningBy(x->x.getId()>2)));
//		
//		{false=[Employee [id=1, firstName=siddu, secondName=linga, department=DEV], 
//		        ], true=[Employee [id=3, firstName=Nari, secondName=DM, department=HR Employee [id=4, firstName=siddu, secondName=linga, department=DEV]} 
		
	
//		System.out.println(
//				emp.stream().collect(Collectors.partitioningBy(x->x.getId()>2,Collectors.toSet())));
		
//		System.out.println(
//				emp.stream().collect(Collectors.groupingBy(e->e.getDepartment(),Collectors.counting())));
		
//		System.out.println(
//				emp.stream().collect(Collectors.groupingBy(e->e.getDepartment())));
		
//		System.out.println(
//				emp.stream(). collect(Collectors.groupingBy(e->e.getDepartment(),Collectors.mapping(e->e.getFirstName(), Collectors.toSet()))));
	
		System.out.println(
				emp.stream(). collect(Collectors.groupingBy(e->e.getDepartment(),Collectors.mapping(e->e.getFirstName(), Collectors.joining(", ")))));
	
	
	}
	}

