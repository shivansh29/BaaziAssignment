package com.Assignment.Question4;

public class Producer implements Runnable {

	Queue queue;
	
	
	public Producer(Queue queue) {
		super();
		this.queue = queue;
	}

	@Override
	public void run() {
		try {
			produce();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public void produce() throws InterruptedException {
		int value = 0;

		while (true) {
			synchronized (this) {

				while (queue.isFull()) {
					System.out.println("Producer cannot add more elements");
					wait();
				}
				// to insert the jobs in the queue
				queue.queueEnqueue(value++);
				System.out.println("producer added value"+ (value-1));
				// notifies the consumer thread that
				notify();
				Thread.sleep(1000);
				if(value>=10) return;
			}

		}
	}
	
}
