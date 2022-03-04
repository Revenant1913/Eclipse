package practice;

public class Exp2_Prog1 {

	public static void main(String[] args) {
		 
		
		
		
	int	i = Integer.parseInt(args[0]);
	int	j = Integer.parseInt(args[1]);
	int	k = Integer.parseInt(args[2]);
		
	if (i > j && i > k)
		System.out.println("Largest number is " + i);
	
	else if (j > i && j > k)
		System.out.println("Largest number is " + j); 
	
	else 
		System.out.println("Largest number is " + k);

	}

}
