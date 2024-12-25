package practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Find elements which are starting with 1 by using java 8
public class J {
	
public static void main(String[] args) {
	List<Integer> list=Arrays.asList(11,95,15,91);
	System.out.println(
	list.stream().map(s->s.toString()).filter(s->s.startsWith("1")).collect(Collectors.toList()));
}
}
