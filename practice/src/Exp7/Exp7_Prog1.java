package Exp7;
import java.util.Scanner;
import java.util.Arrays ;


public class Exp7_Prog1 {

	public static void main(String[] args) {
		//String names[] = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
				/*Scanner s = new Scanner(System.in);
				System.out.print("Enter names:- ");
				String input_names = s.nextLine();*/
				
				String [] names = new String[10];
				int i = 0;
				for (i = 0; i < names.length; i++) {
					
			        names[i] = args[i];
					System.out.println((i + 1) + " " +names[i]);
				}
				if (args.length >= 12) {
					try {
						System.out.println(names[12]);
								
					}

					catch(ArrayIndexOutOfBoundsException e) {
						
						System.out.println("This is an exception");
						
					}
					
				}
				
	}

	

}
