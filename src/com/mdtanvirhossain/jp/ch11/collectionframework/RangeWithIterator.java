package com.mdtanvirhossain.jp.ch11.collectionframework;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class RangeWithIterator implements Iterable<Integer>, Iterator<Integer> {
	
	private int start;
	private int end;
	private int cursor;
	
	

	public RangeWithIterator(int start, int end) {
		//super();
		this.start = start;
		this.end = end;
	}
	

	public static void main(String[] args) {
		RangeWithIterator rangeWithIterator = new RangeWithIterator(1, 10);
		for (Integer cur : rangeWithIterator) {
			System.out.println(cur + " , ");
		}

	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return cursor <= end;
	}

	@Override
	public Integer next() {
		if(!hasNext()) {
			cursor = start;
			throw new NoSuchElementException();
		}
		return cursor ++;
	}

	@Override
	public Iterator<Integer> iterator() {
		cursor = start;
		return this;
	}

}
