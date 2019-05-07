package learningExample.basic;
// 12321
public class Palindrome {
	public static void main(String args[]){
		int i = 12329;
		 int num = 0;
		boolean flag = true;
		while(i > 0){
			int r = i %10;//3
			i = i /10;//12
			num = num*10 + r;
			
		}
		System.out.println(num);
	}
}
