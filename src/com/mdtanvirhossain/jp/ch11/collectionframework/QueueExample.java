package com.mdtanvirhossain.jp.ch11.collectionframework;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		for (int i = 100; i >= 0; i--) {
			queue.add(i);
		}
		
		while(!queue.isEmpty()) {
			Integer poll = queue.poll();
			doSomeWork(poll);
			
		}

	}
	
	private static void doSomeWork(Integer value) {
		System.out.println("Do some work with + " + value);
	}

}
