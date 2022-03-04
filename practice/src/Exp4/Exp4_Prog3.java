package Exp4;
import java.util.Scanner;
class worker
{
 protected int salary_rate;
 protected String name;
 protected float salaray;
}
class daily_worker extends worker
{
 float days = 0f;
 daily_worker(){
 super.salary_rate= 600;
 }
 void ComPay(int hour){
 days = (float) hour/ (24f) ; 

 super.salaray = (float)(super.salary_rate) * this.days;
 System.out.println("Daily Worker salary is "+super.salaray+" for"+this.days+" days");
 }
}
class salaried_worker extends worker
{
 salaried_worker(){
 super.salary_rate = 900;
 }
 void ComPay(int hour){
 super.salaray = super.salary_rate * 40;
 System.out.println("Salaried Worker salary-"+super.salaray);
 }
}

public class Exp4_Prog3 {

	public static void main(String[] args) {
		daily_worker d1 = new daily_worker();
		 salaried_worker s1 = new salaried_worker();
		 int Daily_worker_hours, Salaried_worker_hours;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the Daily Worker hours-");
		 Daily_worker_hours = sc.nextInt();
		 d1.ComPay(Daily_worker_hours);
		 System.out.println("Enter the Salaried Worker hours-");
		 Salaried_worker_hours = sc.nextInt();
		 s1.ComPay(Salaried_worker_hours); 


	}

}
