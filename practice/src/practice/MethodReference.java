package practice;

import java.util.Arrays;
import java.util.List;

public class MethodReference {
public static void main(String[] args) {
	List<String> str=Arrays.asList("Sidu@#$","moiunika","nari 1224");
	str.stream()
	//.map(e->MethodReference.replace(e))
	 .map(MethodReference::replace)
	//.map(e->new Student(e))
	.map(Student::new)
	.forEach(x->System.out.println(x));
}

public static String replace(String str) {
	return str.replaceAll("[^a-z,A-Z]", "");
}
}