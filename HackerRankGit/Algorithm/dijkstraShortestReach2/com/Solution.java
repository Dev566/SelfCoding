package dijkstraShortestReach2.com;

import java.io.BufferedInputStream;
import java.util.Comparator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.TreeMap;

class Node {
	int id;
	int value = Integer.MAX_VALUE;
	Map<Integer, Integer> adjList = new TreeMap<Integer, Integer>();
	Boolean IsVisited = false;

	Node(int ID) {
		this.id = ID;
	}

	public boolean SetValue(int val) {
		if (val < this.value) {
			this.value = val;
			return true;
		}
		return false;
	}

	public void addEdge(int node, int value) {
		if (adjList.containsKey(node)) {
			if (adjList.get(node) > value)
				adjList.put(node, value);
		} else
			adjList.put(node, value);
	}

	public int getValueEdge(int node) {
		if (adjList.containsKey(node)) {
			return adjList.get(node);
		} else
			return -1;
	}
}

public class Solution {

	public static void ADDEdge(int n1, int n2, int val, Map<Integer, Node> tMap) {
		// System.out.println(n1.id);
		Node first, second;
		if (tMap.containsKey(n1)) {
			first = tMap.get(n1);
		} else {
			first = new Node(n1);
			tMap.put(n1, first);
		}
		if (tMap.containsKey(n2)) {
			second = tMap.get(n2);
		} else {
			second = new Node(n2);
			tMap.put(n2, second);
		}
		first.addEdge(second.id, val);
		second.addEdge(first.id, val);

	}

	public static void ApplyDijkstra(Node n, Map<Integer, Node> tMap, PriorityQueue<Node> pq) {
		n.IsVisited = true;
		for (int key : n.adjList.keySet()) {
			Node temp = tMap.get(key);
			if (temp.SetValue(n.value + n.adjList.get(key))) {
				if (temp.IsVisited == false) {
					if (pq.contains(temp))
						pq.remove(temp);
					pq.add(temp);
				}

			}
		}
	}

	public static void ApplyDijkstra2(Node n, Map<Integer, Node> tMap, PriorityQueue<Node> pq) {

		while (pq.size() != 0) {
			ApplyDijkstra(pq.remove(), tMap, pq);
			if (pq.peek() == null)
				break;
		}

	}

	public static void PrintVal(Map<Integer, Node> tMap, int n, int start) {
		for (Map.Entry<Integer, Node> entry : tMap.entrySet()) {
			int key = entry.getKey();
			int val = entry.getValue().value;
			if (val == Integer.MAX_VALUE)
				val = -1;
			if (key != start)
				System.out.print(val + " ");
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedInputStream(System.in, 65536));
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {

			int n = in.nextInt();
			int m = in.nextInt();
			Map<Integer, Node> tMap = new TreeMap<Integer, Node>();
			for (int a1 = 0; a1 < m; a1++) {
				int x = in.nextInt();
				int y = in.nextInt();
				int r = in.nextInt();
				ADDEdge(x, y, r, tMap);
			}
			int s = in.nextInt();
			Node StartPoint = tMap.get(s);
			StartPoint.SetValue(0);

			PriorityQueue<Node> pq = new PriorityQueue<Node>(n, new Comparator<Node>() {
				public int compare(Node n1, Node n2) {
					if (n1.value < n2.value)
						return -1;
					else
						return 1;
				}
			});
			pq.add(StartPoint);
			ApplyDijkstra2(StartPoint, tMap, pq);
			PrintVal(tMap, n, s);
			System.out.println();
		}
		in.close();
	}
}