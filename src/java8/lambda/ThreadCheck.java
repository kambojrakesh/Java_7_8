package java8.lambda;


public class ThreadCheck {
	public static void main(String args[]){
		Runnable rn = () -> System.out.println("Hello run check");
		Thread th = new Thread(rn);
		th.start();
	}
}
