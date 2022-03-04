package Exp8;

import java.io.DataInputStream;

public class Exp8_Prog1 {

	public static void main(String[] args) throws Exception{
		 try{
		 int last=0;
		 DataInputStream str = new DataInputStream(System.in);
		 System.out.println("Enter the string: ");
		 String s1=str.readLine();
		 System.out.println("Enter the string to be searched: ");
		 String s2=str.readLine();
		 int l1=s1.length();
		 int l2=s2.length();
		 for(int i=0;i<=(l1-l2);i++) {
		 if(s1.substring(i,l2+i).equals(s2)) {
		 if(last==0)
		 System.out.println("The first occurrence of thestring to be searched is at position :"+(i+1));
		 last=i+1;
		 }
		 }
		 if(last!=0)
		 System.out.println("The last occurrence of the string to besearched is at position :"+last);
		 else
		 System.out.println("the string is not found");
		 }
		 catch(Exception e){
		 System.out.println(e);
		 }
		 } 

}

		

	
