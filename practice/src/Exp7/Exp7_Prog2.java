package Exp7;

public class Exp7_Prog2 {

	public static void main(String[] args) {
		
	
		try {
			
			int c = 10/0;
		}
catch(ArithmeticException e) {
	
	System.out.println(" Division by 0 not possible");
}
	}

}
