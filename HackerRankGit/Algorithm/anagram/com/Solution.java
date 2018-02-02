package anagram.com;

import java.util.Scanner;

public class Solution {

	static int anagaram(String s) {
		// Complete this function
		int[] first = new int[27];
		int[] second = new int[27];
		int n = s.length();
		int result = -1;
		if (n % 2 == 0) {
			result = 0;
			int mid = n / 2;
			for (int i = 0; i < mid; i++) {
				first[s.charAt(i) - 'a']++;
				// System.out.println(mid+i);
				second[s.charAt(mid + i) - 'a']++;
			}
			for (int i = 0; i < 27; i++) {
				// System.out.println(first[i]+" "+second[i]);
				if (first[i] > second[i]) {
					result += first[i] - second[i];
					// System.out.println(first[i]+" "+second[i]);
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		for (int a0 = 0; a0 < q; a0++) {
			String s = in.next();
			int result = anagaram(s);
			System.out.println(result);
		}
	}
}
