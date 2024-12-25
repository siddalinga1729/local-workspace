package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//grouping given chars
public class GroupingChars {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String string = sc.next();
		groupingChars(string);
		groupingChars1(string);
	}

	private static void groupingChars(String string) {
		Map<String, Long> map = new HashMap<>();
		for (int i = 0; i < string.length(); i++) {
			if (map.containsKey(string.charAt(i)+"")) {
				map.put(string.charAt(i) + "", map.get(string.charAt(i)+"") + 1l);
			} else {
				map.put(string.charAt(i) + "", 1l);
			}
		}
		map.forEach((x,y)->System.out.println("Char: "+x+"\n"+"Values: "+ y+""));
	}
	private static void groupingChars1(String string) {
		Map<String, Long> map = new HashMap<>();
		for (int i = 0; i < string.length(); i++) {
			map.put(string.charAt(i)+"", map.getOrDefault(string.charAt(i)+"", 0l)+1l);}
		map.forEach((x,y)->System.out.print(x+y+""));
	}
}
