package practice;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Stack;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class ValidParentheses {
	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>(); // create an empty stack
		for (char c : s.toCharArray()) { // loop through each character in the string
			if (c == '(') // if the character is an opening parenthesis
				stack.push(')'); // push the corresponding closing parenthesis onto the stack
			else if (c == '{') // if the character is an opening brace
				stack.push('}'); // push the corresponding closing brace onto the stack
			else if (c == '[') // if the character is an opening bracket
				stack.push(']'); // push the corresponding closing bracket onto the stack
			else if (stack.isEmpty() || stack.pop() != c) // if the character is a closing bracket
				// if the stack is empty (i.e., there is no matching opening bracket) or the top
				// of the stack
				// does not match the closing bracket, the string is not valid, so return false
				return false;
		}
		// if the stack is empty, all opening brackets have been matched with their
		// corresponding closing brackets,
		// so the string is valid, otherwise, there are unmatched opening brackets, so
		// return false
		return stack.isEmpty();
	}

	static boolean ispar(String x) {
		// add your code here

		Stack<Character> s = new Stack<Character>();
		for (char c : x.toCharArray()) {
			if (c == '(') {
				s.push(')');
			} else if (c == '{')
				s.push('}');
			else if (c == '[')
				s.push(']');
			else if (s.empty() || s.pop() != c)
				return false;
		}

		return s.empty();
	}

	static int strstr(String s, String x) {
		// Your code here
		for (int i = 0; i <= s.length() - x.length(); i++) {
			String subs = s.substring(i, i + x.length());
			if (subs.equals(x)) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
	}
}
