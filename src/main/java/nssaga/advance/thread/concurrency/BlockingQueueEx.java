/**
  BlockingQueueEx.java
 ***********************************************************************************************************************
 Description: 	

 Revision History:
 -----------------------------------------------------------------------------------------------------------------------
 Date         	Author               	Reason for Change
 -----------------------------------------------------------------------------------------------------------------------
 03-May-2020		Nawal Sah				Initial Version

 Copyright (c) 2018,
 ***********************************************************************************************************************
 */
package nssaga.advance.thread.concurrency;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueEx {
	public static void main(String[] args) {
		BlockingQueue<Message> queue = new ArrayBlockingQueue<>(10);
		Producer producer = new Producer(queue);
		Consumer consumer = new Consumer(queue);

		new Thread(producer).start();
		new Thread(consumer).start();

		System.out.println("Producer and consumer has started");
	}
}

class Message {
	private String message;

	public Message(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}

class Producer implements Runnable {

	private BlockingQueue<Message> messageQueue;

	public Producer(BlockingQueue<Message> messageQueue) {
		this.messageQueue = messageQueue;
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i < 50; i++) {
				Message msg = new Message("" + i);
				Thread.sleep(i);
				messageQueue.put(msg);
				System.out.println("Produced : " + msg.getMessage());
			}
			Message msg = new Message("Exit");
			messageQueue.put(msg);
		} catch (InterruptedException e) {
			System.out.println("Interrupted in producer");
		}
	}
}

class Consumer implements Runnable {
	private BlockingQueue<Message> messageQueue;

	public Consumer(BlockingQueue<Message> messageQueue) {
		this.messageQueue = messageQueue;
	}

	@Override
	public void run() {
		Message message;
		try {
			while (!(message = messageQueue.take()).getMessage().equals("Exit")) {
				Thread.sleep(10);
				System.out.println("Consumed : " + message.getMessage());
			}
		} catch (InterruptedException e) {
			System.out.println("Interrupted in consumer");
		}
	}
}
