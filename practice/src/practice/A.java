package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class A {
	public A() {
		return;
	}

	public static void main(String[] args) {
		String test = "";
		for (int i = 0; i < 5; i++) {
			if (i == 1) {
				System.out.println(test += i + "");
				break;
			} else
				System.out.println(test += i + "");
		}
		List<String> list = new ArrayList<>();
		list.add("siddu");
		System.out.println(list.get(0));

		Map<String, Integer> map = new HashMap<>();
		map.put("Siddu", 1);
		map.put("test", 2);
		Integer integer = map.get("Siddu");
		System.out.println(integer + "+++++++++++++++");
	}
}
