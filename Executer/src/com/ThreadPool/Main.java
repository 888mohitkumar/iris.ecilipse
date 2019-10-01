package com.ThreadPool;

public class Main {
	 
    public static void main(String[] args) {
        ThreadPool pool = new ThreadPool(7);
 
        for (int i = 0; i < 25; i++) {
            Task task = new Task(i);
            pool.execute(task);
        }
}
}
