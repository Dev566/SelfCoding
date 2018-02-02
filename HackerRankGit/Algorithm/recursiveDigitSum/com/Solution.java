package recursiveDigitSum.com;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner obj = new Scanner(System.in);
		String a = obj.next();
		int b = obj.nextInt();

		long sum = 0;
		for (int i = 0; i < a.length(); i++) {
			sum += (a.charAt(i) - 48);
		}

		sum *= b;

		if (sum % 9 == 0)
			System.out.println(9);

		else
			System.out.println(sum % 9);

	}
}
