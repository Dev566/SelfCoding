package aTaleOfTwoStackQueueImplementation.com;

import java.util.Scanner;
import java.util.Stack;

class MyQueue<T> {
	Stack<T> stout = new Stack<T>();
	Stack<T> stin = new Stack<T>();

	public void enqueue(T num) {
		stin.push(num);
	}

	public T peek() {
		if (stout.empty()) {
			while (!stin.empty())
				stout.push(stin.pop());
		}
		return stout.peek();
	}

	public void dequeue() {
		if (stout.empty()) {
			while (!stin.empty())
				stout.push(stin.pop());
		}
		stout.pop();
	}
}

public class Solution {
	public static void main(String[] args) {
		MyQueue<Integer> queue = new MyQueue<Integer>();

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		for (int i = 0; i < n; i++) {
			int operation = scan.nextInt();
			if (operation == 1) { // enqueue
				queue.enqueue(scan.nextInt());
			} else if (operation == 2) { // dequeue
				queue.dequeue();
			} else if (operation == 3) { // print/peek
				System.out.println(queue.peek());
			}
		}
		scan.close();
	}
}
