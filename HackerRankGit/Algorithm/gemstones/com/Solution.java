package gemstones.com;

import java.util.Scanner;

public class Solution {

	static int gemstones(String[] arr) {
		// Complete this function
		int result = 0;
		int[] alp;
		String s;
		int[] fin = new int[27];
		for (int i = 0; i < arr.length; i++) {
			alp = new int[27];
			s = arr[i];
			for (int j = 0; j < s.length(); j++) {
				int ch = s.charAt(j) - 'a';
				if (alp[ch] != 1) {
					alp[ch] = 1;
					fin[ch]++;
				}
			}

		}
		int n = arr.length;
		for (int i = 0; i < 27; i++)
			if (fin[i] == n)
				result++;
		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String[] arr = new String[n];
		for (int arr_i = 0; arr_i < n; arr_i++) {
			arr[arr_i] = in.next();
		}
		int result = gemstones(arr);
		System.out.println(result);
	}
}
