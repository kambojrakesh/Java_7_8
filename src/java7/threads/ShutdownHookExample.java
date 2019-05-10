package java7.threads;

class Worker implements Runnable{

	@Override
	public void run() {
		System.out.println("FInal Hook");
	}
	
}
public class ShutdownHookExample{
	
    public static void main(String[] args)  {
    	Worker worker=new Worker();
    	Thread thread = new Thread(worker);
    	Runtime runtime = Runtime.getRuntime();
    	try {
			Thread.sleep(1000);
		} catch (Exception e) {
		}
    	runtime.addShutdownHook(thread);
    }
}
