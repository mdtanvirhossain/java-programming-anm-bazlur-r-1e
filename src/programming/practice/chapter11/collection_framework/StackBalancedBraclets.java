package programming.practice.chapter11.collection_framework;

import java.util.Stack;

public class StackBalancedBraclets {
	
	public static boolean isBalanced(String expression) {
		Stack<Character> stack = new Stack<>();
		char[] chars = expression.toCharArray();
		
		for (char aChar : chars) {
			if (stack.empty()) {
				stack.push(aChar);
			}
			else {
				char peek = stack.peek();
				
				if(peek == '(' && aChar == ')') {
					stack.pop();
				}
				else if (peek == '{' && aChar == '}') {
					stack.pop();
				}
				else if (peek == '[' && aChar == ']') {
					stack.pop();
				}
				else {
					stack.push(aChar);
				}
			}
		}
		
		return stack.empty();
	}
	
	public static void main(String[] args) {
		String[] brackets = {"(()){}()", "({})", "({}(", "){})"};
		
		for (String exp : brackets) {
			String isBalanced = isBalanced(exp) ? "balanced" : "not balanced";
			
			System.out.println(exp + " is " + isBalanced);
		}
	}

}
