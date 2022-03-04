package test1;


public class Test3 extends Thread {
	
	public static void main(String[] args) {
		
		Thread obj1 = new Thread("this is a thread");
		
		 obj1.start();
		String s = obj1.getName();
		  obj1.setName("new");
		 
	System.out.println(s);
	 System.out.println(obj1.getName());
		}

	}


