package practice;

public class SecondMaxNumber {
	public static void main(String[] args) {
		int[] x = { 1, 5, 8, 6 };
		int max = 0;
		int s_max = 0;
		for (int i = 0; i < x.length; i++) {
			if (x[i] > max) {
				s_max = max;
				max = x[i];
			} else if (x[i] > s_max) {
				s_max = x[i];
			}
		}
		System.out.println(s_max);
	}
}
