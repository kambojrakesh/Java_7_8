package java8.stream;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.*;


public class ListToMapStream {
   public static void main(String args[]){
	   Product p1= new Product("Computer","HCL",100);
	   Product p2= new Product("SOftware","TCS",300);
	   Product p3= new Product("Sim card","Info",3000);
	   
	   ArrayList<Product> al = new ArrayList<Product>();
	   al.add(p1);
	   al.add(p2);
	   al.add(p3);
	   
	  Map map = al.stream().collect(Collectors.toMap(p->p.price, p->p.brand));
	  System.out.println(map);
	   
   }
}
class ProductStream{
	String name;
	String brand;
	int price;
	ProductStream(String name, String brand,int price){
		this.brand = brand;
		this.name = name;
		this.price=price;
	}
}

interface check{
	int h=1;
	static void h(){
		
	}
	default void h1(){
		
	}
	
}