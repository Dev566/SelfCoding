package balancedBrackets.com;

import java.util.Scanner;
import java.util.Stack;

public class Solution {

	public static boolean isBalanced(String expression, int[] ar) {
		Stack<Character> st = new Stack<Character>();
		boolean result = true;
		char ch;
		int n = expression.length();
		for (int i = 0; i < n; i++) {
			ch = expression.charAt(i);
			if (ch == '[' || ch == '{' || ch == '(') {
				st.push(ch);
			} else if (ch == ']' || ch == '}' || ch == ')') {
				if (st.empty() || ar[st.pop()] != ch)
					return false;
			} else
				return false;
		}
		if (!st.empty())
			result = false;
		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		int[] ar = new int[255];
		ar['('] = ')';
		ar['['] = ']';
		ar['{'] = '}';
		for (int a0 = 0; a0 < t; a0++) {
			String expression = in.next();
			System.out.println((isBalanced(expression, ar)) ? "YES" : "NO");
		}
		in.close();
	}
}
