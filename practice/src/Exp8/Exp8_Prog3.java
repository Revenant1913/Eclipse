package Exp8;

import java.io.DataInputStream;
import java.io.IOException;

public class Exp8_Prog3 {

	public static void main(String[] args) throws IOException {
		 DataInputStream in=new DataInputStream(System.in);
		 System.out.println("Enter a statement: ");
		 String s1=in.readLine();
		 System.out.println("Converting to upper case: ");
		 System.out.println(s1.toUpperCase());

		

	}

}
