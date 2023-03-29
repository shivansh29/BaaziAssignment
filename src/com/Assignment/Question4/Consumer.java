package com.Assignment.Question4;

public class Consumer implements Runnable {
	
	Queue queue;

	public Consumer(Queue queue) {
		super();
		this.queue = queue;
	}

	@Override
	public void run() {
		try {
			consume();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	public void consume() throws InterruptedException {
		while (true) {

			synchronized (this)

			{
				while (queue.isEmpty()) {
					System.out.println("Consumer is waiting");
					wait();
				}
				// to retrieve the first job in the list
				int val = queue.queueDequeue();
				System.out.println("Consumer consumed-" + val);
				notify();
				Thread.sleep(1000);

			}

		}
	}

 }


