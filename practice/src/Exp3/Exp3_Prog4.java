package Exp3;

public class Exp3_Prog4 {

	public static void main(String[] args) {

		
		int sum = 0;
		
		for(int i = 41; i < 250; i++) {
			
			if(i % 5 == 0)
			{
				sum += i;
				
			}
			
		}
		
		System.out.println(sum);

	}

}
