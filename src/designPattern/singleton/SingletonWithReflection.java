package designPattern.singleton;

import java.io.Serializable;
import java.lang.reflect.Constructor;

public class SingletonWithReflection {
	public static void main(String []args){
		Singleton1 ag1 = Singleton1.getObject();
		Singleton1 ag2 = null;
		
		try{
			/*
			 * 
			 * Not work because constructor is private
			 * 
			 * 
			Class c1=Class.forName("designPattern.AntiSingletonWithReflection");
			AntiSingletonWithReflection ag3 = (AntiSingletonWithReflection) c1.newInstance();
			
			Class c2=Class.forName("designPattern.AntiSingletonWithReflection");
			AntiSingletonWithReflection ag4 = (AntiSingletonWithReflection) c2.newInstance();
			
			System.out.println(ag3.hashCode());
			System.out.println(ag4.hashCode());
			
			*
			*
			*
			*/
			
			Constructor<?>[] cons=Singleton1.class.getDeclaredConstructors();
			
			for(Constructor constructor:cons){
				constructor.setAccessible(true);
				ag2 = (Singleton1)constructor.newInstance();
			}
			

			System.out.println(ag1.hashCode());
			System.out.println(ag2.hashCode());
			
		} catch(Exception e){
			System.out.println(e);
		}
	}
}

class Singleton1 implements Serializable{
	static Singleton1 singleton;
	
	private Singleton1(){}
	
	public static Singleton1 getObject(){
		if(singleton == null) {
			synchronized (Singleton1.class) {
				if(singleton == null){
					singleton = new Singleton1();
				}
			}
		}
		return singleton;
	}
}
