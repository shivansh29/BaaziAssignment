package com.Assignment.Question4;

public class MainApplication {

	public static void main(String[] args) {
		Queue queue =new Queue(10);
		Producer producer = new Producer(queue);
		Consumer consumer = new Consumer(queue);
		Thread t1=new Thread(producer);
		Thread t2=new Thread(consumer);
		
		t1.start();
		t2.start();
		
		
	}

}
