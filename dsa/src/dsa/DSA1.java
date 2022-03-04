package dsa;
import java.util.Scanner;

public class DSA1 {

	
	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int factor = 0;
		int number = 0;
		int factor1 = 0;
		for(int i = 1; i <= N; i++) {
			
			factor = N % i;
			
			if(factor == 0) {
				number++;
            System.out.print("\n" + i + " ");
				
				
				}
			}
		
		
		
	}

}
