package java7.threads;

class Worker1 implements Runnable{

	@Override
	public void run() {
		System.out.println("FInal Hook");
	}
	
}
public class RuntimeExample{
	
    public static void main(String[] args)  {
    	Worker1 worker=new Worker1();
    	Thread thread = new Thread(worker);
    	Runtime runtime = Runtime.getRuntime();
    	try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
    	runtime.addShutdownHook(thread);
    }
}
