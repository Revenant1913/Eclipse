package Exp3;

public class Exp3_Prog2 {

	public static void main(String[] args) {
		
		

		int [] numbers = new int[10];
		
		int square = 0;
		int sum = 0;
		
		for(int i = 0; i < 10; i++)
		{
		    numbers[i] = Integer.parseInt(args[i]);
			square = numbers[i] * numbers[i];
			
			if(i == 0) 
			{
			   System.out.println("The squares are ");
			
			}
				
			  System.out.println(square);	
			  
			  sum += square;
			  
			  
		}
		
		
		System.out.println("\nThe sum is\n" + sum);

	}

}
