package practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//Input:
//N = 5
//arr = [1, 1, 2, 5, 5]
//Output:
//false
//Explanation:
//The array contains 2 (1’s), 1 (2’s) and 2 (5’s), since the number of frequency of 1 and 5 are the same i.e. 2 times. 
//Therefore, this array does not satisfy the condition.
public class IsFrequencyUnique {
	public static boolean isFrequencyUnique(int n, int[] arr) {
        // code here
        Map<Integer,Integer> map=new HashMap();
        Set<Integer> s=new HashSet();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
       for(Entry e:map.entrySet()) {
    	   if(!s.add((int)e.getValue()))return false;
       }
        return true;
    }
	public static void main(String[] args) {
		int arr[]= {0,0,0,-4,-4};
		System.out.println(isFrequencyUnique(arr.length,arr));
	}
}
