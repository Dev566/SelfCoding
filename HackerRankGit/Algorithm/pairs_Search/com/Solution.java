package pairs_Search.com;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	static Map<Integer, Integer> tMap = new TreeMap<Integer, Integer>();
	static int count = 0;

	static int pairs(int[] a, int k) {
		/* Complete this function */
		return count;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int res;

		String n = in.nextLine();
		String[] n_split = n.split(" ");

		int _a_size = Integer.parseInt(n_split[0]);
		int _k = Integer.parseInt(n_split[1]);

		int[] _a = new int[_a_size];
		int _a_item;
		String next = in.nextLine();
		String[] next_split = next.split(" ");

		for (int _a_i = 0; _a_i < _a_size; _a_i++) {
			_a_item = Integer.parseInt(next_split[_a_i]);
			_a[_a_i] = _a_item;
			if (tMap.containsKey(_a_item + _k))
				count += tMap.get(_a_item + _k);
			if (tMap.containsKey(Math.abs(_a_item - _k))) {
				if (_a_item > _k || Math.abs(_a_item - _k) > _k)
					count += tMap.get(Math.abs(_a_item - _k));
			}

			if (tMap.containsKey(_a_item))
				tMap.put(_a_item, tMap.get(_a_item) + 1);
			else
				tMap.put(_a_item, 1);
		}

		res = pairs(_a, _k);
		System.out.println(res);
	}
}
