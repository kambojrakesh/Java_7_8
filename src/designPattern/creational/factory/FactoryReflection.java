package designPattern.creational.factory;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

public class FactoryReflection {
	static HashMap hs = new HashMap();
	
	public static void registerProduct(String id,Class productClass){
		hs.put(id, productClass);
	}

	public static Computer getInstance(String id) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		Class cs= (Class) hs.get(id);
		Constructor cons = cs.getDeclaredConstructor();
		return (Computer) cons.newInstance();		
	}
}
