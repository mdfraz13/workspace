package com.java8.problems.concurrency;

import java.util.ArrayList;
import java.util.List;

public class BlockingQueueImpl {

	private List<Integer> objectList = null;
	private int size = 10;

	public BlockingQueueImpl(){
		objectList = new ArrayList<>(size);
	}

	public BlockingQueueImpl(int size){
		this.size = size;
		objectList = new ArrayList<>(size);
	}

	public synchronized void enqueue(Integer value){
		try{
			while(objectList.size() == size){
				wait();
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		size++;
		objectList.add(value);
		notifyAll();
	}

	public synchronized Integer dequeue(){
		try{
			while(objectList.size() == 0){
				wait();
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		size--;
		notifyAll();
		return objectList.get(size - 1);
	}

}
