package dsa;

public class dsaStringSearch {

	static void search(String name, char letter) {
		
		for(int i=0; i < name.length(); i++) {
			
			char element = name.charAt(i);
			if(element == letter) {
				
				System.out.print(i);
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		String name = "Abhi";
		char letter = 'i';
		
		search(name, letter);

	}
	

}
