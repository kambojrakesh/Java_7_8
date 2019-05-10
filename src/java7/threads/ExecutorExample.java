package java7.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WorkerThread implements Runnable{
	int i ;
	WorkerThread(int i){
		this.i=i;
	}
	@Override
	public void run() {
		System.out.println(i);
	}
}
public class ExecutorExample{
	
    public static void main(String[] args)  {
    	ExecutorService  exe = Executors.newFixedThreadPool(10);
    	for(int i =0;i<20;i++){
    		Runnable wt=new WorkerThread(i);
    		exe.execute(wt);
    	}
    	exe.shutdown();
    }
}
