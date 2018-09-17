package java8.lambda;

import java.util.ArrayList;
import java.util.List;


public class Looping {
	public static void main(String args[]){
		
		List<String> al = new ArrayList();
		al.add("Hello");
		al.add("Friends");
		al.add("How are you!");
		
		for (String str : al) {
			System.out.println(str);
		}
		
		al.forEach(
			(str)->System.out.println(str)
		);
	}
}
