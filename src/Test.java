import java.util.HashMap;
import java.util.Map;


public class Test{
	
	
    public static void main(String[] args)  {
    	
    	int h = 1;
    	HashMap hm=new HashMap();
    	check(hm, h);
    	System.out.println(hm);
    	System.out.println(h);
		
    }
    

	static void check(Map hm, int h) {
		hm.put(1, 2);
		h = 2;
		hm = null;
			
	}
		 
	
}
