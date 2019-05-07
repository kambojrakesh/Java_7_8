package learningExample.array;

public class RotateLeftToRight {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7};
		int len = arr.length-1;
		for(int i = 0; i < len/2; i++){
			int temp = arr[len-i];
			arr[len-i] = arr[i];
			arr[i] = temp;
		}
		for(int i = 0; i < len; i++){
			System.out.println(arr[i]);
		}
	}

}
