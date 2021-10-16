package com.mdtanvirhossain.jp.ch13.mathapiandutilityclass;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		Random random = new Random();
		int aRandom = random.nextInt();
		System.out.println(aRandom);
	}
}
