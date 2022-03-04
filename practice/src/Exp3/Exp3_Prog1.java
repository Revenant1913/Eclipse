package Exp3;

import java.util.Arrays;
import java.util.Scanner;

public class Exp3_Prog1 {
	
	public static void main(String[] args) {
		
		 String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		 
		 int i = Integer.parseInt(args[0]);
		
		System.out.println("The month is " + months[i - 1]);	
		
	}
}