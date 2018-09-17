package java8.stream;

import java.util.ArrayList;
import java.util.Optional;
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
	   
	   
	   //1 . foeach loop
	   /*al.forEach(
		   a1 -> System.out.println(a1.name)
	   );*/
	   
	   
	   //2. fetch list by stream based on condition
	   /*List ls = al.stream().filter(p ->p.price >10).map(p->p.price).collect(Collectors.toList());
	   System.out.println(ls);
	   
	   
	   
	   //3. fetch list by stream based on condition and print
	   al.stream().filter(p->p.price >10).map(p->p.price).forEach(System.out::println);
	   
	   
	   
	   //4. fetch price by stream based on condition
	   al.stream().filter(p->p.price==100).forEach(p->System.out.println(p.price));
	   
	   
	   */
	   	//5. Sum by reduce and Integer::sum
	   /*int totalPrice2= al.stream().map(product->product.price).reduce((int) 0.0f,Integer::sum);
	   System.out.println(totalPrice2);*/
	   
	   
	   //Print price by comparison by max
	   /*Product productB = al.stream().max((p3,p4)-> p3.price > p4.price ? 1:-1).get();	
	   System.out.println(productB.price);*/
	   
	   //convert list to set based on condition
	   Set set=al.stream().filter(p->p.price>10).map(p->p.price).collect(Collectors.toSet());
	   set.forEach(
		  setVal->System.out.print(setVal)
	   );
	   
	   
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