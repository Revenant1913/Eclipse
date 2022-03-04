package Exp7;

public class Exp7_Prog3 {

	public static void main(String[] args) {
		
		try {
			
			//int [] array = new int[5];
			//System.out.println(array[8]);
			
			//int a = 10/0;
			 String no_value = null;
			 System.out.println(no_value.length());

		}
		catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Array index is out of bounds");
		}
		catch(ArithmeticException e) {
			
			System.out.println("This is an Arithmetic Exception");
			
		}
        catch(NullPointerException e) {
        	
        	System.out.println("This is a Null Pointer exception");
        }
		catch(Exception e) {
			
			System.out.println("this is an excetion");
			}
	}

}
