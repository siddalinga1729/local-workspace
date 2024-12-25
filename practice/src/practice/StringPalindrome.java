package practice;

import java.util.Stack;

public class StringPalindrome {
	public static int isPalindrome(String S) {
		Stack<Character> s = new Stack<>();
		for (char c : S.toCharArray()) {
			s.push(c);
		}
		StringBuilder reverse = new StringBuilder();
		int size = s.size();
		for (int i = 0; i < size; i++) {
			reverse.append(s.pop() + "");
		}
		if (S.equals(reverse.toString()))
			return 1;
		else
			return 0;
	}

	public static void main(String[] args) {
		int palindrome = isPalindrome("ete");
		System.out.println(reverseWords("i.like.nbmn"));
	}

	static String reverseWords(String S) {
		// code here
		String[] words = S.split("\\.");
		String output = "";
		for (int i = words.length - 1; i > 0; i--) {
			output += words[i] + ".";
		}
		return output.substring(0, output.length()-1);
	}
}
