package java8.reference;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.*;


public class StaticMethodReference  {
	static void print(int i){
		System.out.println("Hello check :: "+i);
	}
   public static void main(String args[]){
	  List<Integer> al=Arrays.asList(12,1,3,14,19,01,03);
	  //normal
	  for(int no:al){
		  //print(no);
	  }

	  //lambda
	  /*al.forEach(
		a1->print(a1)
	   );*/

	  //reference
	  al.forEach(StaticMethodReference::print);
	   
   }
}
