package practice;

import java.util.Arrays;

public class SecondSmallestinArray {
	public static void main(String[] args) {
		int[] x = { 10000, 10001, 99, 2562 };
		Arrays.sort(x);
		System.out.println(x[1]);
		int min = 9999;
		int s_min = 0;
		for (int i = 0; i < x.length; i++) {
			if (x[i] < min) {
				s_min = min;
				min = x[i];
			} else if (x[i] < s_min) {
				s_min = x[i];
			}
		}
		System.out.println(min);
	}
}
