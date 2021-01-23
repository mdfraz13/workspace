package com.concurrency.examples.customThreadPool;

public class CustomThreadPoolClient {

	public CustomThreadPoolClient() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		CustomThreadPool pool = new CustomThreadPool(4);
		pool.execute(new MyTask());
		pool.execute(new MyTask());
		pool.execute(new MyTask());
		pool.execute(new MyTask());
		pool.execute(new MyTask());
		pool.execute(new MyTask());
		
		pool.shutdown();
	}

}
