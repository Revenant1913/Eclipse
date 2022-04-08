package dsa;

class search{
	static int searchItem(int [] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		while(start <= end) {
			
			
			int mid = (start + end)/2;
			
			if(target < arr[mid]) {
				end = mid -1;	
				
			}else if(target > arr[mid]){
				start = mid +1;
			
			}else {
				return mid;
			}
		}
		return -1;
	}
}
public class binarySearch {

	public static void main(String[] args) {
		
		int [] arr = {1, 4, 6, 8, 10};
		int target = 10;
		
		search A = new search();
	 System.out.println(A.searchItem(arr, target));	

	}

}
