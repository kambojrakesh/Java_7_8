package designPattern.singleton;

import java.io.Serializable;

public class Singleton implements Serializable{
	static Singleton singleton;
	
	private Singleton(){}
	
	public static Singleton getObject(){
		if(singleton == null) {
			synchronized (Singleton.class) {
				if(singleton == null){
					singleton = new Singleton();
				}
			}
		}
		return singleton;
	}
	
	protected Object readResolve(){
		return getObject();
	}
}
