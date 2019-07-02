package programming.practice.chapter5.array;

public class ArrayDemo3 {

	public static void main(String[] args) {
		final int array_length = 10;
		
		int[] a = new int[array_length];
		
		for (int i=0; i< a.length; i++) {
			a[i] = fib(i);
		}
		
		System.out.println("Index\tValue");
		
		for(int i = 0; i<a.length; i++) {
			System.out.println(i + "\t" +a[i]);
		}
		
	
	}
	
	public static int fib(int n) {
		if(n <= 1) {
			return n;
		}
		else {
			return fib(n-1) + fib(n-2);
		}
	}
}
