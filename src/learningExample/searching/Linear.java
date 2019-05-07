package learningExample.searching;

import java.util.Arrays;

public class Linear {
	static int doSearching(int arr[], int num){
		Arrays.sort(arr);
		
		for(int i = 0; i<arr.length; i++){
			if(arr[i]==num)
				return i;
		}
		
		return 0;
	}
	public static void main(String[] args) {
		int arr[] =  {20,1,3,5,2,8,9,4,0,111};
		int num = 5;
		System.out.println(doSearching(arr, 111));
	}
}
