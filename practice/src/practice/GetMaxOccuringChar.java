package practice;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

//it will fail for one character
public class GetMaxOccuringChar {
	public static char getMaxOccuringChar(String line)// gfg
	{
		// Your code here
		int max = 0;
		char[] s = line.toCharArray();
		Arrays.sort(s);// fgg
		Map<Integer, Character> m = new TreeMap<>();
		for (int i = 0; i < line.length(); i++) {
			int c = 0;
			for (int j = 0; j < line.length(); j++) {
				if (s[j] == s[i])
					c++;
			}
			if (c > max) {
				max = c;
				if (!m.containsValue(s[i]))
					m.put(c, s[i]);
			}
		}
		return m.get(max);

	}

	public static void main(String[] args) {
		System.out.println(getMaxOccuringChar("dkkccaa"));
	}
}
