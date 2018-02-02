package countingSort2.com;

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
		int[] ar = new int[101];
		for (int i = 0; i < n; i++) {
			ar[scan.nextInt()]++;
		}
		for (int i = 0; i < 101; i++) {
			for (int j = 0; j < ar[i]; j++)
				System.out.print(i + " ");
		}
	}
}