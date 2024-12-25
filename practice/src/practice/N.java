package practice;

//input:"a2b3c2"
//output:"aabbbcc"
public class N {

	public static void main(String[] args) {
		String str = "a2b3c2";
		for (int i = 0; i < str.length(); i++) {
			if (Character.isAlphabetic(str.charAt(i))) {
				System.out.print(str.charAt(i));
			}
			else {
				int n = Character.getNumericValue(str.charAt(i));
				for (int j = 1; j < n; j++) {
					System.out.print(str.charAt(i-1));
				}
			}
		}
		
		
	
	}

}
