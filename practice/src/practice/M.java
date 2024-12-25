package practice;
//given a list consist of 5 and 8 ,5 will come first then after 8
//1---add all elements which are not lie between 5 and 8
//2---Concatenate all elements lie between 5and 8
public class M {
public static void main(String[] args) {
	String s="1,2,5,4,9,8,7";
	String s1 = s.replace(",", "");
	int sum=0;
	String s3 = s1.substring(s1.indexOf("5"), s1.indexOf("8")+1);
	System.out.println("Second Case--"+s3);
	String s4 = s1.replace(s3, "");
	for (int i = 0; i < s4.length(); i++) {
		sum+=Character.getNumericValue( s4.charAt(i));
	}
	System.out.println("First Case--"+sum);
}
}
