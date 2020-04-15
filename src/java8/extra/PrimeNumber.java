public class PrimeNumber {
	public static void main(String[] args) {
		int number = 20;
		int flag = 0;
		boolean val;

		for (int j = 2; j < number; j++) {
			 val = false;
			for (int i = 2; i < j; i++) {
				if (j % i == 0) {
					val = true;
					break;
				}
			}
			if (!val)
				System.out.println(j + " Prime number");
		
		}
	}
}