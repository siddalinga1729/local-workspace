package practice;

//reverse given string without affecting position of special character
public class P {

	public static void main(String[] args) {

		String str = "S#$%idd$^I";
		char[] arr = str.toCharArray();
		int i = 0;
		int j = arr.length - 1;
		while (i < j) {
			if (!Character.isAlphabetic(arr[i]))
				i++;
			else if (!Character.isAlphabetic(arr[j]))
				j--;
			else {
				char c = arr[i];
				arr[i]=arr[j];
				arr[j]=c;
				i++;
				j--;
			}
		}
		String finalString=new String(arr);
		System.out.println(finalString);
	}

}
