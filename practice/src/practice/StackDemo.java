package practice;

import java.util.Stack;

public class StackDemo {
public static void main(String[] args) {
	Stack<Integer> stack=new Stack<>();
	stack.add(13);//last item
	stack.add(12);
	stack.add(11);
	stack.add(null);//top
	//System.out.println(stack.pop());
	//System.out.println(stack.push(12));
	System.out.println(stack.pop());
}
}
