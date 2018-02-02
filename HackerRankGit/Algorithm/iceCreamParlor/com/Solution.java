package iceCreamParlor.com;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			int m = scan.nextInt();
			int n1 = scan.nextInt();
			int a = -1;
			int b = -1;
			Map<Integer, Integer> sT = new TreeMap<Integer, Integer>();
			for (int j = 0; j < n1; j++) {
				int num = scan.nextInt();
				int rem = m - num;
				if (sT.containsKey(rem) && a == -1) {
					a = sT.get(rem);
					b = j + 1;
				}
				if (!sT.containsKey(num))
					sT.put(num, j + 1);

			}
			System.out.println(a + " " + b);
		}

		scan.close();
	}
}
