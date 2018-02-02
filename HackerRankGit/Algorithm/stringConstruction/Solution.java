package stringConstruction;

import java.util.Scanner;

public class Solution {

	static int stringConstruction(String s) {
		// Complete this function
		int count = 0;
		int[] ar = new int[27];
		for (int i = 0; i < s.length(); i++) {
			int ch = s.charAt(i) - 'a';
			if (ar[ch] == 0) {
				ar[ch]++;
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		for (int a0 = 0; a0 < q; a0++) {
			String s = in.next();
			int result = stringConstruction(s);
			System.out.println(result);
		}
		in.close();
	}
}
