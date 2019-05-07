package java8.threads;

public class ThreadCreation1 {
   public static void main(String args[]){
	   Thread thread = new Thread(() ->	System.out.println(1233));
	   thread.start();
   }
}