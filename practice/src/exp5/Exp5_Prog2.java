package exp5;

interface A{
	
	void meth1();
	void meth2();
	
}

class Myclass implements A{
	
	public void meth1() {
		System.out.println("This is meth1");
		
	}
	public void meth2() {
		System.out.println("This is meth2");
		
	}
}
public class Exp5_Prog2 {

	public static void main(String[] args) {
		
		Myclass a = new Myclass();
		a.meth1();
		a.meth2();

	}

}
