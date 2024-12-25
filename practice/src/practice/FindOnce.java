package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindOnce {
	int findOnce(int arr[], int n)
    {
        // Complete this function
        Map<Integer,Integer> map=new HashMap();
        for(int i:arr){
         map.put(i,map.getOrDefault(i,0)+1);
        }
        Set<Entry<Integer, Integer>> entrySet = map.entrySet();
           for(Entry e:entrySet) {
        	   if((int)e.getValue()==1)return (int)e.getValue();
           }
        
        return 0;
    }
	public static void main(String[] args) {
		
	}
}
