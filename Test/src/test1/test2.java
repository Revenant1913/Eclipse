package test1;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;
import java.lang.reflect.Array;
import java.math.*;

class A {
	
	String num1 = "this is class A";
	
	
	
}

interface B{
	
	String num = "this is interface B"; 
}

class C extends A implements B{
	
	void method2() {
		
		System.out.println(num1 + "  " + num);
	}
	
}
public class test2 {
	
	public static void main(String[] args) {
    
		C obj = new C();
		
		obj.method2();
  	
		
	}
}
 