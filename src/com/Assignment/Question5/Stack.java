package com.Assignment.Question5;

import java.util.LinkedList;
import java.util.Queue;

public class Stack {

	 Queue<Integer> queue1 = new LinkedList<Integer>();
	 Queue<Integer> queue2 = new LinkedList<Integer>();

     int current;

		public void push(int x) {
			queue2.add(x);

			while (!queue1.isEmpty()) {
				queue2.add(queue1.peek());
				queue1.remove();
			}
			Queue<Integer> q = queue1;
			queue1 = queue2;
			queue2 = q;
		}

		public void pop() {

			if (queue1.isEmpty())
				return;
			queue1.remove();
		}

		public int top() {
			if (queue1.isEmpty())
				return -1;
			return queue1.peek();
		}

		public int size() {
			return queue1.size();
		}
}
