package programming.practice.chapter13.mathapi_and_utilityclass;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		Random random = new Random();
		int aRandom = random.nextInt();
		System.out.println(aRandom);
	}
}
