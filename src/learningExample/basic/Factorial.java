package learningExample.basic;

public class Factorial {
	public static void main(String args[]) {
		System.out.println(getFactorial(4));
	}

	static int getFactorial(int i) {
		if (i == 0)
			return 1;
		else
			return i * getFactorial(i - 1);
	}
}
