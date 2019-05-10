package java7.threads;


public class DeadLocks{
	
    public static void main(String[] args)  {
    	final String s1 = "resource1";
    	final String s2 = "resource2";
    	
    	new Thread(){
    		public void run(){
    			synchronized (s1) {
    				System.out.println("Resource s1 is in use.");
    				try {
    					Thread.sleep(1000);
					} catch (Exception e) {	}
    				synchronized (s2) {
    					System.out.println("Resource s2 is in use.");
    				}
				}
    		}
    	}.start();
    	
    	new Thread(){
    		public void run(){
    			synchronized (s2) {
    				System.out.println("Resource s2 is in use.");
    				try {
    					Thread.sleep(1000);
					} catch (Exception e) {	}
    				synchronized (s1) {
    					System.out.println("Resource s1 is in use.");
    				}
				}
    		}
    	}.start();

    }
}
