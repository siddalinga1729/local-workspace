package practice;

public class StockOverFlowException {
	public static void main(String[] args) {
		getNumber(2);
	}

	public static int getNumber(int i) {
		System.out.println(i);
		return getNumber(i + 2);
	}
}
