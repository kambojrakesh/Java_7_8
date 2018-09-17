package designPattern.singleton;

public class SingletonWithClone {
	public static void main(String []args) throws CloneNotSupportedException {
		CloneSingleton cs1 = CloneSingleton.getObject();
		//CloneSingleton cs2 = (CloneSingleton) cs1.clone();
		
		CloneSingleton cs2 = (CloneSingleton) cs1.clone();
		
		System.out.println(cs1.hashCode());
		System.out.println(cs2.hashCode());
	}
}

class CloneSingleton implements Cloneable{
	
	static CloneSingleton singleton;
	private CloneSingleton(){}
	
	public static CloneSingleton getObject(){
		if(singleton == null) {
			synchronized (CloneSingleton.class) {
				if(singleton == null){
					singleton = new CloneSingleton();
				}
			}
		}
		return singleton;		
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return singleton; 
	}
}
