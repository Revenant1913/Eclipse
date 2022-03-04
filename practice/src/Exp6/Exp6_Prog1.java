package Exp6;

import java.util.Scanner;


public class Exp6_Prog1 {
	String name;
	 int rollno;

	public static void main(String[] args) {}
		
		 
		 public Exp6_Prog1(){
		  name = "";
		  rollno = 0;
		 }
		 public void get(){
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the student Name-");
		 name = sc.next();
		 System.out.println("Enter the student Rollno-");
		 rollno = sc.nextInt();
		 }
		 public void display(){
		 System.out.println("Student Name-"+name);
		 System.out.println("Student Rollno-"+rollno);
		 }
	}


	