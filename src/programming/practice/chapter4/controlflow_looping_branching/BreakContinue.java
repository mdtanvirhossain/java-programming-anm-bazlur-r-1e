package programming.practice.chapter4.controlflow_looping_branching;

public class BreakContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1 ; i < 10 ; i++) {
			if (i%2 == 0) {
				continue;
			}
			
			System.out.println(i);
			
			if (i==7) {
				break;
			}
		}
	}

}
