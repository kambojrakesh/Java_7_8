package java7.threads;

class Worker2 implements Runnable{

	@Override
	public void run() {
		
		lock();
	}

	synchronized static void lock() {
		System.out.println("Final Hook for " + Thread.currentThread().getName());
	}
	
}
public class StaticSynExample{
	
    public static void main(String[] args)  {
    	Worker2 worker1=new Worker2();
    	Worker2 worker2 =new Worker2();
    	
    	Thread t1=new Thread(worker1);
    	Thread t2=new Thread(worker1);
    	Thread t3=new Thread(worker2);
    	Thread t4=new Thread(worker2);
    	
    	t1.setName("t1");
    	t2.setName("t2");
    	t3.setName("t3");
    	t4.setName("t4");
    	
    	t1.start();
    	t2.start();
    	t3.start();
    	t4.start();
    }
}
