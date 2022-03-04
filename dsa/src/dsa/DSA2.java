package dsa;
import java.lang.*;
import java.util.Arrays;

class Array{
	int [] num;
	int count;
	public Array(int a){
		num  = new int[a];
	}
	
	public void insert(int b) {
		num[count] = b;
		count++;
		
		for(int i= 0; i < count; i++) {
			
			
		}
	}
	
	public void print() {
		System.out.println(Arrays.toString(num));
		
	}
}

public class DSA2 {

	public static void main(String[] args) {
	
		Array numbers = new Array(4);
		numbers.insert(2);
		numbers.insert(3);
		numbers.insert(4);
		numbers.insert(5);
		//numbers.insert(6);
		numbers.print();

	}

}
