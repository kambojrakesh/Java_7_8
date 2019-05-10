package java7.threads;
class Worker4{
	int amount = 10000;
	
	 synchronized void withdrawAmount(int i){
		if(i > amount){
			System.out.println("Amount is less :: " + amount );
			try{wait();}catch(Exception e){}  
		}
		amount = amount - i;
		System.out.println("Amount withdrawn : " + i );
		
	}

	 synchronized void depoist(int i) {
		
		amount = amount + i;
		System.out.println("Amount is added :: " + amount );
		notify();
		
	}
}

public class InterThreadCommEx{
	
    public static void main(String[] args)  {
    	final Worker4 w4=new Worker4();
    	new Thread(){
    		public void run(){
    			w4.withdrawAmount(15000);
    		}
    	}.start();
    	
    	
    	new Thread(){
    		public void run(){
    			w4.depoist(100);
    		}
    	}.start();
    }
}
