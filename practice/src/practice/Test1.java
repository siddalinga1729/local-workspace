package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Test1 {

	public static void plusMinus(List<Integer> arr) {
		// Write your code here
		int p = 0;
		int z = 0;
		int n = 0;
		for (Integer integer : arr) {
			if (integer == 0)
				z++;
			if (integer < 0)
				n++;
			if (integer > 0)
				p++;
		}
		System.out.println(1 / 6);
		// System.out.println(p);
		// System.out.println(n%arr.size());
		// System.out.println(z%arr.size());
	}

	public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
		List<Integer> resulList = new ArrayList<>();
		if (a.get(0) > b.get(0))
			resulList.add(1);
		if (a.get(0) < b.get(0))
			resulList.add(1);
		for (int i = 1; i < a.size() && i < b.size(); i++) {
			if (a.get(i) > b.get(i))
				resulList.add(0, resulList.get(0) + 1);
			if (a.get(i) < b.get(i))
				resulList.add(1, resulList.get(1) + 1);
		}
		return resulList;
	}

	public static void main(String[] args) {
		
		
	}
}
class Test2 extends Test1 {
}
