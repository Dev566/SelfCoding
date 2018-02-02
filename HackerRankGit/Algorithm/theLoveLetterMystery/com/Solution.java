package theLoveLetterMystery.com;

import java.util.Scanner;

public class Solution {

	static int theLoveLetterMystery(String s) {
		// Complete this function
		int n = s.length();
		int mid = n / 2;
		int count = 0;
		for (int i = 0; i < mid; i++) {
			int firstCh = s.charAt(i);
			int secondCh = s.charAt(n - 1 - i);
			count += Math.abs(firstCh - secondCh);

		}
		return count;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		for (int a0 = 0; a0 < q; a0++) {
			String s = in.next();
			int result = theLoveLetterMystery(s);
			System.out.println(result);
		}
	}
}
