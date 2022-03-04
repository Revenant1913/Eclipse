package Exp4;
import java.util.Arrays;


class Player
{
 String[] Cricket_Player = {"Virat Kohli", "Rohit Sharma"};
 String[] Football_Player= {"Zlatan Ibrahimovic","Cristiano Ronaldo"};
 String[] Hockey_Player={"Dhyan Chand","Udham Singh"};
}
class Cricket_Player extends Player
{
 void show(){
 System.out.println(Arrays.toString(super.Cricket_Player));
 }
}
class Football_Player extends Player
{
 void show(){
 System.out.println(Arrays.toString(super.Football_Player));
 }
}
class Hockey_Player extends Player
{
 void show(){
 System.out.println(Arrays.toString(super.Hockey_Player));
 }
} 

		 public class Exp4_Prog1 {
			public static void main(String args[]){
				Football_Player p1 = new Football_Player();
				 Cricket_Player c1 = new Cricket_Player();
				 Hockey_Player h1= new Hockey_Player();
				 p1.show();
				 c1.show();
				 h1.show(); 


		}
		}


	
