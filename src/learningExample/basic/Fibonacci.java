package learningExample.basic;
// 0 1 1 2 3 5 8
public class Fibonacci {
	public static void main(String args[]){
		int f = 0;
		int s = 1;
		int sum = 0;
		for(int i =0; i < 10; i++){
			sum = f + s;
			System.out.println(sum);
			//int tmp = f;
			f = s;
			s = sum;
		}
	}
}
