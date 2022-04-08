package dsa;

public class BinarySearchCeiling {

	static int ceiling(int [] arr, int target) {
		
		int start = 0;
		int end = arr.length - 1;
		
		while(start<= end) {
			
			int mid = (start + end)/2;
			 if (arr[mid]> target) {
				 end = mid - 1;
			 }
			 else if(arr[mid] < target){
				 start = mid + 1;
				 }
			 else if(arr[mid] == target){
				  return arr[mid];
			 }
			
		}
		
		return arr[start];
	}
		
	public static void main(String[] args) {
		
		int [] arr = {3, 5, 6, 8, 10};
		int target = 5;
		
		   System.out.println(ceiling(arr, target));

	}

}
