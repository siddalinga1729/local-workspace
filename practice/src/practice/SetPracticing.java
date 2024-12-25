package practice;

import java.util.HashSet;
import java.util.Set;

public class SetPracticing {
public static void main(String[] args) {
	Set<String> str=new HashSet<>();
	str.add("siddu");
	str.add("test");
	str.add("test");
	for (String string : str) {
		System.out.println(string);
	}
}

}
