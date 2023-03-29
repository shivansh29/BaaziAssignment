package com.Assignment.Question4;

public class Queue {

	private int front, rear, capacity;   
	 

	private int queue[];

	Queue(int size) {
		front = rear = 0;
		capacity = size;
		queue = new int[capacity];
	} 
	     
		void queueEnqueue(int item) {
			synchronized (this) {
				if (capacity == rear) {
					System.out.println("Queue is full");
					return;
				}

				else {
					queue[rear] = item;
					rear++;
				}
				return;
			}

		}  
	    
	    
		int queueDequeue() {
			synchronized (this) {
				int x=-1;
				if (front == rear) {
					System.out.println("Queue is empty");
					return -1;
				} else {
					x=queue[0];
					for (int i = 0; i < rear - 1; i++) {
						queue[i] = queue[i + 1];
					}
					if (rear < capacity)
						queue[rear] = 0;
					rear--;
				}
				return x;
			}

		}  
	     
	     
		boolean isFull() {
			if (front == 0 && rear == capacity - 1) {
				return true;
			}
			return false;
		}

		boolean isEmpty() {
			if (front == -1)
				return true;
			else
				return false;
		}
	    
	    
}
