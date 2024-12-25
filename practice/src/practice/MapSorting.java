package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MapSorting {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("siddu", 1);
		map.put("Mouni", 2);
		map.put("Nari", 3);
		map.entrySet().stream().sorted(Map.Entry.comparingByKey());
		List<Entry<String, Integer>> listOfMap = new ArrayList<>(map.entrySet());
		System.out.println(listOfMap);
	}
}
