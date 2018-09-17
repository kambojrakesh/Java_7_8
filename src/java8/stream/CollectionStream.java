package java8.stream;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.*;


public class CollectionStream {
   public static void main(String args[]){
	   Product p1= new Product("Computer","HCL",100);
	   Product p2= new Product("SOftware","TCS",300);
	   
	   ArrayList<Product> al = new ArrayList<Product>();
	   al.add(p1);
	   al.add(p2);
	   
	   /*for(Product p:al){
		   System.out.println(p.name);
	   }*/
	   
	   al.forEach(
		   a1 -> System.out.println(a1.name)
	   );
	   
	   List ls = al.stream().filter(p ->p.price >10).map(p->p.price).collect(Collectors.toList());
	   System.out.println(ls);
	   
	   al.stream().filter(p->p.price >10).map(p->p.price).forEach(System.out::println);
	   
   }
}
class Product{
	String name;
	String brand;
	int price;
	Product(String name, String brand,int price){
		this.brand = brand;
		this.name = name;
		this.price=price;
	}
}