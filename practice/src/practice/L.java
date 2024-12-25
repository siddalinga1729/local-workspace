package practice;

//printing percentage of number types in 6 decimal
public class L {
	public static void main(String[] args) {
		int[] x = { -1, -2, 0, 5, 6 };
		int pass = 0;
		int neg = 0;
		int z = 0;
		for (int i = 0; i < x.length; i++) {
			if (x[i] > 0)
				++pass;
			if (x[i] < 0)
				++neg;
			if (x[i] == 0)
				++z;
		}
		System.out.println(String.format("%.6f", (double)pass / x.length) + '\n' + String.format("%.6f", (double)neg / x.length) + '\n'
				+ String.format("%.6f", (double)z / x.length));
	
	}
}
