package dsa;
import java.util.*;

public class BubbleSort {
	
	static int[] sort(int [] arr) {
		int i = 0;
		 
		
		for ( i = 0; i < arr.length; i++) {
			int end = arr.length - i;
			for (int j = 1; j < end; j++ ) {
				
				if(arr[j] < arr[j - 1]) {
				
				 int replace = arr[j];
			     arr[j] = arr[j-1];
			     arr[j-1] = replace;
		
				}
				
			}
		}
		return arr;
	}
	
	static int [] selection(int [] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			int insertionEnd = arr.length - i - 1;
			int max = getMaxIndex(arr, 0, insertionEnd);
			int temp = arr[max]; 
		    arr[max] = arr[insertionEnd];
		    arr[insertionEnd] = temp;
		    
		}
		
		return arr;
	}
	
	static int[] insertion(int [] arr) {
		
		
		
		return arr;
	}
	
	private static int getMaxIndex(int [] arr, int start, int last) {
		int max1 = start;
		for(int i = start; i <= last; i++) {
			if (arr[max1] < arr[i]) {
				max1 = i;
			}
		}
		return max1;
	}

	public static void main(String[] args) {
		
		int [] arr = {4, 3, 2, 5, 8};
		String array = Arrays.toString(selection(arr));
		System.out.println(array);
		

	}

}
