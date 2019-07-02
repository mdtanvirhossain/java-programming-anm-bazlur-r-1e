package programming.practice.chapter5.array;

import java.util.Random;

import javax.management.RuntimeErrorException;

public class MatrixCalculator {
	
	//generating random value
	Random random = new Random();
	
	//return a random value between 0 and 1
	public  int[][] random(int m, int n) {
		int[][] c = new int[m][n];
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				c[i][j] = random.nextInt(100);
			}
		}
		
		return c;
		
	}
	
	//multiply
	//return c= a*b;
	public   int[][] multiply(int[][] a, int[][] b){
		
		int mA = a.length;
		int nA = a[0].length;
		int mB = b.length;
		int nB = b[0].length;
		
		if(nA != mB) {
			throw new RuntimeException("Illegal Matrix Dimension");
		}
		
		int[][] c = new int[mA][nB];
		for (int i = 0; i < mA; i++) {
			for (int j = 0; j < nB; j++) {
				for (int k = 0; k < nB; k++) {
					
				}
			}
		}
		
		return c;
	}

	//return c = a+b;
	public int[][] add(int[][] a, int[][]b){
		int n = a[0].length;
		int m = a.length;
		
		int c[][] = new int[m][n];
		
		for(int i=0; i<m; i++) {
			for (int j = 0; j < n; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		
		
		return c;
	}
	
	//return c= a-b;
	public int[][] subtract(int[][] a, int[][]b){
		int n = a[0].length;
		int m = a.length;
		
		int c[][] = new int[m][n];
		
		for(int i=0; i<m; i++) {
			for (int j = 0; j < n; j++) {
				c[i][j] = a[i][j] - b[i][j];
			}
		}
		
		
		return c;
	}
	
	//printing answer
	public void print(int x[][]) {
		for(int row=0; row<x.length; row++) {
			for (int col = 0; col < x[row].length; col++) {
				System.out.println(x[row][col] + "\t");
			}
			System.err.println();
		}
	}
	
	//main function
	public static void main(String[] args) {
		
		MatrixCalculator matrixCalculator = new MatrixCalculator();
		
		int[][] a = matrixCalculator.random(5, 5);
		int[][] b = matrixCalculator.random(5, 5);
		
		int[][] multiply = matrixCalculator.multiply(a, b);
		System.out.println("Result #1. Multiply : ");
		matrixCalculator.print(multiply);
		
		int[][] add = matrixCalculator.add(a, b);
		System.out.println("Result #2. Add : ");
		matrixCalculator.print(add);
		
		int[][] subtarct = matrixCalculator.subtract(a, b);
		System.out.println("Result #3. Subtract : ");
		matrixCalculator.print(subtarct);

	}

}
