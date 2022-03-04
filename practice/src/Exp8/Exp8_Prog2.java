package Exp8;

public class Exp8_Prog2 {
	static String conversionUpperCase(String s){
		 String result = "";
		 char ch = ' ';
		 for (int i = 0; i < s.length(); i++) {
		 if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
		 ch = (char)(s.charAt(i) - 32);
		 }
		 else {
		 ch = (char)(s.charAt(i));
		 }
		 result += ch;
		 }
		 return result;
		 }

	public static void main(String[] args) {
		
		System.out.println(conversionUpperCase("java"));
	}

}
