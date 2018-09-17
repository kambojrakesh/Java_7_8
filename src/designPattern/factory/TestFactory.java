package designPattern.factory;

import java.lang.reflect.InvocationTargetException;

public class TestFactory {

	public static void main(String obj[]) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		/*Computer com1= Factory.getInstance("Pc", "10GB", "400gb");
		Computer com2= Factory.getInstance("Server", "10GB", "200gb");
		
		System.out.println(com1.getHardDisk()+ com1.getRam());
		System.out.println(com2.getHardDisk()+ com2.getRam());*/
		
		FactoryReflection.registerProduct("Pc", Pc.class);
		Computer cs3= FactoryReflection.getInstance("Pc");
		cs3.reflectdCall();
		
		FactoryReflection.registerProduct("Server", Server.class);
		Computer cs4= FactoryReflection.getInstance("Server");
		cs4.reflectdCall();
	}
}
