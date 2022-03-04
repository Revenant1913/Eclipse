package exp5;
import java.util.Scanner;
interface A{
 void division(int a,int b);
 void modules(int a,int b);
}
class Operations implements A{
 float division;
 int modulor;
 
 public void division(int a, int b) {
 division = (float)a/(float)b;
 System.out.println("Division of "+a+"/"+b+ "="+division);
 }
 
 public void modules(int a, int b) {
 modulor = a%b;
 System.out.println("Modulor of"+ a+" %"+b+ "="+modulor);
 }
} 


public class Exp5_Prog4 {

	public static void main(String[] args) {
		
		Operations o1 = new Operations();
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter 2 number on which operation applied-");
		 System.out.println("enter number 1 -");
		 int a =sc.nextInt();
		 System.out.println("enter number 2 -");
		 int b = sc.nextInt();
		 o1.division(a,b);
		 o1.modules(a,b);
		 } 

}

		

	