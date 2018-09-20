package designPattern.creational.singleton;

import java.io.Serializable;
import java.lang.reflect.Constructor;
//prove that we cant break SIngleton by Reflection
public class SingletonWithReflectionResolve {
	public static void main(String []args){
		EnumSingleton ag1 = EnumSingleton.getObject();
		EnumSingleton ag2 = null;
		
		try{
		
			Constructor<?>[] cons=EnumSingleton.class.getDeclaredConstructors();
			//Cannot reflectively create enum objects
			for(Constructor constructor:cons){
				constructor.setAccessible(true);
				ag2 = (EnumSingleton)constructor.newInstance();
			}
			

			System.out.println(ag1.hashCode());
			System.out.println(ag2.hashCode());
			
		} catch(Exception e){
			System.out.println(e);
		}
	}
}

enum EnumSingleton{
	INSTANCE;
	int count = 4;
	public static EnumSingleton getObject(){
		return INSTANCE;
	}
}
