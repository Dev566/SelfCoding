package sherlockAndArray.com;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	static String solve(int[] a, int totalSum) {
		// Complete this function
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			if (sum == totalSum - a[i] - sum)
				return "YES";
			sum += a[i];
		}
		return "NO";
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for (int a0 = 0; a0 < T; a0++) {
			int n = in.nextInt();
			int[] a = new int[n];
			int totalSum = 0;
			for (int a_i = 0; a_i < n; a_i++) {
				a[a_i] = in.nextInt();
				totalSum += a[a_i];
			}
			String result = solve(a, totalSum);
			System.out.println(result);
		}
	}
}
