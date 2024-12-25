package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Streams {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 23, 56, 5, 89, 25);
		// numbers.stream().filter(x->x%2==0).map(x->"number:"+x).forEach(x->System.out.print(x));
		// numbers.stream().filter(x->x%2!=0).map(x->List.of(x+2,x+5)).forEach(x->System.out.print(x));
		// numbers.stream().filter(x->x%2!=0).flatMap(x->List.of(x+2,x+5).stream()).forEach(x->System.out.println(x));
//	System.out.println(
//	numbers.stream().filter(x->x%2!=0).flatMap(x->List.of(x+2,x+5).stream()).reduce((e,carry)->e+carry));
//	System.out.println(
//	numbers.stream().filter(x->x%2!=0).mapToInt(x->x+x).sum());
//	System.out.println(
//			numbers.stream().filter(x->x%2!=0).mapToInt(x->x+x).count());
//	System.out.println(
//			numbers.stream().filter(x->x%2!=0).mapToInt(x->x+x).min());

//	System.out.println(
//			numbers.stream().filter(x->x%2!=0).peek(x->System.out.println(x)).mapToInt(x->x+x).sum());

//		System.out.println(
//				numbers.stream().allMatch(x->x%2==0));
//		System.out.println(
//				numbers.stream().anyMatch(x->x%2==0));
//		System.out.println(
//				numbers.stream().noneMatch(x->x==0));
		// numbers.stream().skip(6).limit(numbers.size()).forEach(x->System.out.println(x));

//		List<Integer> collect = numbers.stream().map(x->x*x).collect(Collectors.toList());
//		System.out.println(collect);

		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(1, "Siddu", "linga", "DEV"));
		empList.add(new Employee(7, "Siddu", "linga", "DEV"));
		empList.add(new Employee(2, "Mounika", "DN", "HR"));
		empList.add(new Employee(3, "Siddu", "linga", "PROD"));
		empList.add(new Employee(4, "Nari", "Nari", "TEST"));
		empList.add(new Employee(5, "Sasi", "Pilli", "ARC"));
		empList.add(new Employee(6, "Sasi", "Pilli", "DEV"));
		List<String> collect = empList.stream().map(x->x.getFirstName()).collect(Collectors.toList());
		//printing duplicate elements in given list
		Set<String> collect2 = collect.stream().filter(x->Collections.frequency(collect, x)>1).collect(Collectors.toSet());
		System.out.println(collect2+"-------------------------");
		
		// empList.stream().forEach(x->System.out.println(x));
//	 List<String> list = empList.stream().map(e->e.getFirstName()).sorted((e1,e2)->e1.compareTo(e2)).toList();
//		System.out.println(list);

//	System.out.println(	
//		empList.stream().map(e->e.getFirstName()).distinct().toList());

//	Map<String, String> collect = empList.stream().collect(Collectors.toMap(e->e.getFirstName(),e-> e.getSecondName(),(a,b)-> a+b));
//		System.out.println(collect);
		long start = System.currentTimeMillis();
		empList.stream().forEach(s -> System.out.println(s));
		long end = System.currentTimeMillis();
		System.out.println(end - start + "****************Normal-Stream*************");
		long start1 = System.currentTimeMillis();
		empList.parallelStream().forEach(s -> System.out.println(s));
		long end1 = System.currentTimeMillis();
		System.out.println(end1 - start1 + "****************Parallel-Stream*************");

	}
}
