package palindromeIndex.com;

import java.util.Scanner;

public class Solution {

	static int palindromeIndex(String s) {
		// Complete this function
		int n = s.length();
		int mid = n / 2;
		int result = -1;
		for (int i = 0; i < mid; i++) {
			int ch1 = s.charAt(i);
			int ch2 = s.charAt(n - i - 1);
			if (ch1 != ch2) {
				int ch3 = s.charAt(i + 1);
				int ch4 = s.charAt(n - i - 2);
				if (ch2 == ch3 && ch4 == s.charAt(i + 2))
					result = i;
				else
					result = n - i - 1;
				break;
			}

		}
		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		for (int a0 = 0; a0 < q; a0++) {
			String s = in.next();
			int result = palindromeIndex(s);
			System.out.println(result);
		}
	}
}
