package programming.practice.chapter4.controlflow_looping_branching;

public class NumberPyramid {

	public static void main(String[] args) {
		int noOfRows = 9;
		int rowCount = 1;
		
		for(int i = noOfRows; i>0 ; i--) {
			for(int j =1; j<=i ; j++) {
				System.out.print(".");
			}
			
			for(int j = 1; j <= rowCount ; j++) {
				System.out.print(rowCount + " ");
			}
			
			System.out.println();
			rowCount++;
		}

	}

}
