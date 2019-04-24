//https://www.geeksforgeeks.org/prevent-singleton-pattern-reflection-serialization-cloning/
package singleton;

import java.lang.reflect.Constructor;


class Singleton  {
	
	public static Singleton instance = new Singleton(); 
	
	private Singleton(){
		
	}
}
public class SingletonRefelction {

	public static void main(String args[]) {
		Singleton singleton1  = Singleton.instance;
		
		Singleton singleton2 = null;
		
		try{
			Constructor[] constructor = Singleton.class.getDeclaredConstructors();
			for(Constructor c:constructor){
				c.setAccessible(true);
				singleton2 =  (Singleton) c.newInstance();
				break;
			}
		} catch (Exception e) {
			
		}
		
		System.out.println(singleton1.hashCode() + " ; " + singleton2.hashCode());
		
	}
}
