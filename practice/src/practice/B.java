package practice;

import java.util.HashMap;
import java.util.Map;

public class B {
public static void main(String[] args) {
	Map<String, String> map=new HashMap<>();
	map.put("adad", null);
	if(map.get("adad")!=null)System.out.println("yess");
}
}
