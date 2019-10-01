package com.producerconsumerAL;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class TestProducerConsumer {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>(16);
		Producer producer = new Producer(list);
		Consumer consumer = new Consumer(list);
		producer.start();
		consumer.start();
	}

}
