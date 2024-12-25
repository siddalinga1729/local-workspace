package practice;

import java.util.HashSet;
import java.util.Set;

public class RotateArray {
	static void rotateArr(int arr[], int d, int n) {
		// add your code here
		int r[] = new int[n];
		int k = 0;
		for (int i = (n - d) - 1; i < n; i++) {
			r[k] = arr[i];
			k++;
		}
		for (int i = 0; i < (n - d) - 1; i++) {
			r[k] = arr[i];
			k++;
		}
		int in = 0;
		for (int m : r) {
			arr[in] = m;
			in++;
		}
		System.out.println(arr);
	}

	static int  remove_duplicate(int A[], int N) {
		// code here
		Set<Integer> s = new HashSet();
		String r = "";
		for (int i : A) {
			if (s.add(i))
				r += i + "";
		}
		return Integer.parseInt(r);
	}

	public static void main(String[] args) {
		int[ ] arr= {2,2,2,2,2,3,3};
		int remove_duplicate = remove_duplicate(arr,arr.length);	
		System.out.println(remove_duplicate);}
}
