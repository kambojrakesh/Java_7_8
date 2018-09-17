package java8.lambda.ArrayListSortExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Product {
	int serial_number;
	String name;
	Product(int serial_number,String name) {
		this.serial_number= serial_number;
		this.name = name;
	}
}
public class LambaCheck {
	public static void main(String args[]){
		
		List<Product> al = new ArrayList();
		al.add(new Product(12,"Hello"));
		al.add(new Product(12,"check"));
		al.add(new Product(12,"quality"));

		//Collections.sort(al);
		
		/*al.forEach(
			(a) -> System.out.println(a)
		);*/
		
		
		
	}
}

