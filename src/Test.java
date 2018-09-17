import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Test {

   public static void main(String h0[]){
	   
	   
	   int q[] ={2,1,5,3,4};
	   //int q[] = {2 ,5, 1 ,3 ,4};
	   //int q[]={5,1 ,2, 3, 7, 8, 6, 4};
	  // int q[]={1 ,2 ,5 ,3 ,7 ,8 ,6 ,4};
	   int length = q.length;
       int[] a1 = new int[length]; 
       int h =1;int q23 =0;boolean h1= false;
       HashMap<Integer,Integer> hs = new HashMap();
       for(int j =0; j < length-1; j++){
	       for(int i =0; i < length-1; i++){
	           int temp = 0;
	           
	           if(q[i] > q[i+1]){
	        	   
	        	   if(hs.get(q[i])!= null && hs.get(q[i]) < 2){
	        		   h=h+1;
	        		   //System.out.println(h);
	        	   }
	        	   hs.put(q[i],h);
	        	   hs.put(q[i+1],h);
	        	  // System.out.println(q[i]+"===="+hs.get(q[i]));
	        	   if(hs.get(q[i]) < 2){
	        		   
	        		   temp = q[i+1] ;
		               q[i+1] = q[i];
		               q[i] = temp; 
	        	   }
	        	   
	        	   
	        	   
	               if(hs.get(q[i])<=2){
	            	   q23=q23+hs.get(q[i]);
	               } 
	              // System.out.println(q[i] +"=="+hs.get(q[i]));
	        	   
	        	   
	        	   
	           }
	       }
      }

       for(int i =0; i < length; i++){
           //System.out.println(i+1 +"====="+q[i]);
            if(q[i] == i+1 ){
                 h1 = true;
            } else{
                h1 = false;
                break;
            }
          // break;
       }
       
       if(h1){
            System.out.println(q23-1);
        } else{
            System.out.println("Too chaotic");
        }
       
   }
   
}
