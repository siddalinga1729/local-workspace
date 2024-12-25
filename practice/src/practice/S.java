package practice;

import java.io.FileNotFoundException;
import java.io.IOException;

//printing duplicate elements in array
public class S {
public static void main(String[] args) throws FileNotFoundException, IOException {
	int[] arr= {1,5,2,2,8,5,1};
	for (int i = 0; i < arr.length; i++) {
		for (int j = i+1; j < arr.length; j++) {
			if(arr[i]==arr[j])System.out.println(arr[i]);
		}
		
	}
	
}
}
