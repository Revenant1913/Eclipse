package Balance;

public class Account {
	 long Balance;
	 String name;
	public static void main(String[] args) {}
		
		
		 public Account(String name, long Balance) {
		 this.name = name;
		 this.Balance = Balance;
		 }
		 public void display_Balance(){
		 System.out.println("Name- "+name);
		 System.out.println("Balance- "+Balance);


	}

}
