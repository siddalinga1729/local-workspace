package practice;

public class ReverseInt {
	public static int reverseInt(int number) {
		int reminder=0;
		int sum=0;
		while(number>0) {
			reminder=number%10;
			sum=(sum*10)+reminder;
			number=number/10;
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		int reverseInt = reverseInt(51);
		System.out.println(reverseInt);
	}
}
