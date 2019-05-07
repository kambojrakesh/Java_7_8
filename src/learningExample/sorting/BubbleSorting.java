package learningExample.sorting;

public class BubbleSorting {
	public static void main(String obj[]){
		int arr[] = {3,5,1,0,9,4,6,7};
		
		doSorting(arr);
		
	}
	static void doSorting(int arr[]){
		int s= arr.length;
		for(int i = 0; i < s; i++){
			for(int j = 0; j < s; j++){
				if(arr[i] < arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
					
			}
		}
		for(int i = 0; i < arr.length; i++){
			System.out.println(arr[i]);
		}
		//return arr;
	}
}
