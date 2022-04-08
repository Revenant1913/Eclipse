package part1;
import java.util.Scanner;

public class Roman {
	
	static int convert(String str) {
		
		int ans = 0;
		
		for(int i = 0; i < str.length(); i++) {
			
			int s1 = value(str.charAt(i));
			
			if(i + 1 < str.length()) {
				
				int s2 = value(str.charAt(i + 1));
				
				if (s1 >= s2) {
					
					ans += s1;
				}
				else {
					ans += s2 - s1;
					i++;
				}
			}
			else {
				ans += s1;
			}
		}
		
		return ans;
	}
	
	
	static int value(char a) {
		
		if(a == 'I') {
			return 1;
		}
		if (a == 'V') {
			return 5;
		}
		if (a == 'X') {
			return 10;
		}
		if (a == 'L') {
			return 50;
		}
		if (a == 'C') {
			return 100;
		}
		if (a == 'D') {
			return 500;
		}
		if (a == 'M') {
			return 1000;
		}
		
		
		return -1;
	}
	
	

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		
		String number = s.nextLine();
		
		System.out.println(convert(number));

	}

}
