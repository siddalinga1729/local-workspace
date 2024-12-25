package practice;

public class H {
	public static void main(String[] args) {
		int[] i = { 2, 5, 8, 6 };
		int sum = 0;
		int r=0;
		int product = 1;
		for (int j = 0; j < i.length; j++) {
			product = product * i[j];
		}
		System.out.println(product);
		while (product > 0) {
			if (product < 10) {
				
				sum += product;
			} else {
				r = product % 10;
				sum +=r;
			}
			product = product / 10;
		}

		System.out.println(sum);
	}
}
