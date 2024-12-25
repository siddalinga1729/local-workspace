package practice;

import java.util.HashMap;
import java.util.Map;

public class G {
	public static void main(String[] args) {
		// Long m=(long)(Math.random());
//	System.out.println((long)(Math.random()*10000));
		//System.out.println("9" + (long) ((Math.random() + Math.pow(10, 4)) * 10000));
		Long l=(long) 0;
		//System.out.println(l);
		Map<Integer,Long> map=new HashMap<>();
		for(int i=0;i<2;i++) {
			map.put(i, (long)0);
		}
		//System.out.println(map);
		map.put(1, 20l);
		System.out.println(map);
	}
}
