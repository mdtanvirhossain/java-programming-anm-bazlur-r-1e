package com.mdtanvirhossain.jp.ch10.javanio;

import java.nio.ByteBuffer;

public class BufferReadWrite {
	public static void main(String[] args) {
		ByteBuffer bb = ByteBuffer.allocate(8);
		
		System.out.println("Write After creation: ");
		printBuffer(bb);
		
		for (int i = 10; i < 18; i++) {
		bb.put((byte) i);	
		}
		
		System.out.println("After Populating data: ");
		printBuffer(bb);
	}
	
	public static void printBuffer(ByteBuffer bb) {
		int limit = bb.limit();
		System.out.print("Position: " + bb.position()+ ", Limit: " + limit);
		
		System.out.print("\nData: ");
		
		for (int i = 0; i < limit; i++) {
			System.out.print(bb.get(i) + " "); 
		}
		
		System.out.println();
	}

}
