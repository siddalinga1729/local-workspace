package practice;

import java.util.HashMap;
import java.util.Map;

public class K {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		int n = 10;
			Map<Integer, Long> map=new HashMap<>();
			for (int k = 0; k < 24; k++) {
				map.put(k, 0l);
			}
			System.out.println(map);
		
		
		long end = System.currentTimeMillis();
		System.out.println(end - start);
		
		
		
		
		
		
		
		String Integer="siddu";
		char String='s';
		System.out.println(Integer+String);
		System.out.println(Integer.substring(1,3));
				
	}
	
	
}
