package learningExample.basic;

public class Armstrong {
	public static void main(String args[]) {
		int num = 154;int sum =0;
		while(num > 0){
			int r = num%10;
			num = num / 10;
			sum = r * r * r + sum;
		}
		System.out.println(sum);
	}
}
