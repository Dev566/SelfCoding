package makingAnagrams.com;

import java.util.Scanner;

public class Solution {

	static int makingAnagrams(String s1, String s2) {
		// Complete this function
		int[] first = new int[27];
		int[] second = new int[27];
		int n1 = s1.length();
		int n2 = s2.length();
		int result = 0;
		for (int i = 0; i < n1; i++) {
			first[s1.charAt(i) - 'a']++;
		}
		for (int i = 0; i < n2; i++) {
			second[s2.charAt(i) - 'a']++;
		}
		for (int i = 0; i < 27; i++) {
			// System.out.println(first[i]+" "+second[i]);
			if (first[i] != second[i]) {
				result += Math.abs(first[i] - second[i]);
				// System.out.println(first[i]+" "+second[i]);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s1 = in.next();
		String s2 = in.next();
		int result = makingAnagrams(s1, s2);
		System.out.println(result);
	}
}