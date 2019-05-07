package learningExample.basic;
// 1 3 5 7 11
public class PrimeNumber {
	public static void main(String args[]){
		for(int i = 2; i < 20; i ++){
			boolean flag = false;
			for(int j = 2; j < i-1 ; j++){
				if(i%j == 0){
					flag = true;
					break;
				}
			}
			if(!flag)
				System.out.println(i);
		}
	}
}
