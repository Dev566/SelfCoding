package weightedUniformStrings.com;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		Set<Integer> setT = new TreeSet<Integer>();
		int prev = s.charAt(0) - 'a' + 1;
		setT.add(prev);
		int count = 1;
		for (int i = 1; i < s.length(); i++) {
			int num = s.charAt(i) - 'a' + 1;
			if (prev == num) {
				count++;
			} else {
				count = 1;
				prev = num;
			}
			int val = count * num;
			if (!setT.contains(val))
				setT.add(val);
		}
		int n = in.nextInt();
		for (int a0 = 0; a0 < n; a0++) {
			int x = in.nextInt();
			// your code goes here
			if (setT.contains(x))
				System.out.println("Yes");
			else
				System.out.println("No");
		}
	}
}
