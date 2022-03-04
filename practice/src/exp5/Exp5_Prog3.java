package exp5;

interface Half{
	
	double half = 0.5;
}

class Students implements Half{
	public void strength(int a){
	
		System.out.println("the half of the class strength is " + half * a);
		
	}
	
}

class Food implements Half{
	public void slice(int b) {
		
		System.out.println("the half of available pizza slices is " + half *b);
	}
	
}
public class Exp5_Prog3 {

	public static void main(String[] args) {
		
		Students s = new Students();
		Food f = new Food();
		
	      s.strength(10);
	      f.slice(6);
		

	}

}
