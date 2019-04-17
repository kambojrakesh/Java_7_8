package java7.threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallableTest{

 public static void main(String []obj){
	ExecutorService ex=Executors.newScheduledThreadPool(26);
	
	Future<Integer> f = ex.submit(new Callable<Integer>() {

		@Override
		public Integer call() throws Exception {
			
			System.out.println(123);
			Thread.sleep(1000);
			return 12;
		}
	});
	
	ex.shutdown();
	
	try {
		System.out.println(f.get());
	} catch (InterruptedException | ExecutionException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 }
}
