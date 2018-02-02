package beautifulBinaryString.com;

import java.util.Scanner;

public class Solution {

	static int minSteps(int n, String B) {
		// Complete this function
		int count = 0;
		for (int i = 0; i < n - 2; i++) {
			if (B.charAt(i) == '0') {
				if (B.charAt(i + 1) == '1') {
					if (B.charAt(i + 2) == '0') {
						i += 2;
						count++;
					}
				}
			}
		}

		return count;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String B = in.next();
		int result = minSteps(n, B);
		System.out.println(result);
	}
}
