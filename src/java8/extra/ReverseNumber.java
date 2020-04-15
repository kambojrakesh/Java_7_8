public class ReverseNumber {
	public static void main(String[] args) {
		int num = 4321;
		int reverseNum = 0;
		
		while(num != 0) {
			reverseNum = reverseNum*10;
			reverseNum = reverseNum + num%10;
			num = num/10;
		}
		System.out.println(reverseNum);
	}
}