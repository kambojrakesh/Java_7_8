package java8.reference;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.*;


public class InstanceMethodReference  {
	static void print(int i){
		System.out.println("Hello check :: "+i);
	}
   public static void main(String args[]){
	  List<Integer> al=Arrays.asList(12,1,3,14,19,2,63);
	  
	  MyComparator myCom = new MyComparator();
	  
	 /* Collections.sort(al, (a,b)->myCom.compare(a, b));*/
	  
	  Collections.sort(al,myCom::compare);
	  
	 /* al.forEach(
			  a1->System.out.println(a1)
			  );*/
	  
	  al.forEach(System.out::println);
	  
	  
	   
   }
   private static class MyComparator{
	   public int compare(final Integer a,final Integer b){
		   return a.compareTo(b);
	   }
   }
}
