package fibonacci_Modified.com;

import java.math.BigInteger;
import java.util.Scanner;

public class Solution {
	public static void main(String args[]) throws Exception {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
		Scanner scan = new Scanner(System.in);
		int t1 = scan.nextInt();
		int t2 = scan.nextInt();
		BigInteger T1 = BigInteger.valueOf(t1);
		BigInteger T2 = BigInteger.valueOf(t2);
		int n = scan.nextInt();
		for (int i = 2; i < n; i++) {
			BigInteger result = T1.add(T2.pow(2));
			T1 = T2;
			T2 = result;
		}

		System.out.println(T2.toString());
	}
}
