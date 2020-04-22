package algorithm.sorting.bubbleSort;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[] = { 1, 3, 6, 0, 8,9, -3, 7, 2 ,10,11};
		int length = arr.length;

		long startTime = System.nanoTime();

		for (int i = 0; i < length; i++) {
			boolean swap = true;

			for (int j = 1; j < length - i; j++) {
				if (arr[j - 1] > arr[j]) {
					int temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
					//swap = false;
					
					System.out.println(i+"----");
				}
			}

//			if (swap) {
//				break;
//			}
		}

		long endTime = System.nanoTime();

		System.out.println(endTime - startTime);

		for (int i = 0; i < length; i++) {
			//System.out.println(arr[i]);
		}

	}
}
