package com.ThreadPool;

import java.util.concurrent.LinkedBlockingQueue;
 
public class ThreadPool {
    private final int nThreads;
    private final PoolWorker[] threads;
    private final LinkedBlockingQueue queue;
 
    public ThreadPool(int nThreads) {
        this.nThreads = nThreads;
        queue = new LinkedBlockingQueue();
        threads = new PoolWorker[nThreads];
 
        for (int i = 0; i < nThreads; i++) {
            threads[i] = new PoolWorker();
            threads[i].setName("Thread:::"+(i+1));
            threads[i].start();
        }
    }
 
    public void execute(Runnable task) {
        synchronized (queue) {
            queue.add(task);
            queue.notify();
        }
    }
 
    private class PoolWorker extends Thread {
        public void run() {
            Runnable task;
 
            while (true) {
                synchronized (queue) {
                    while (queue.isEmpty()) {
                        try {
                            queue.wait();
                        } catch (InterruptedException e) {
                            System.out.println("An error occurred while queue is waiting: " + e.getMessage());
                        }
                    }
                    task = (Runnable) queue.poll();
                }
 
                // If we don't catch RuntimeException,
                // the pool could leak threads
                try {
                	System.out.println("Current Thread::"+Thread.currentThread().getName());
                    task.run();
                } catch (RuntimeException e) {
                    System.out.println("Thread pool is interrupted due to an issue: " + e.getMessage());
                }
            }
        }
    }
}

class Task implements Runnable {
	 
    private int num;
 
    public Task(int n) {
        num = n;
    }
 
    public void run() {
        System.out.println("Task " + num + " is running and Current Thread name is::"+Thread.currentThread().getName());
        try{
        	Thread.sleep(2000);
        }
        catch(Exception e)
        {
        	
        }
    }
}