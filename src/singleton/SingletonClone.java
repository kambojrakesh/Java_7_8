package singleton;

class Singleton2 implements Cloneable{
	public static Singleton2 instance1 = new Singleton2();
	
	private Singleton2(){
		
	}
	
	@Override
	  protected Object clone() throws CloneNotSupportedException{
		  throw new CloneNotSupportedException();
	}
}
public class SingletonClone {
	public static void main(String obj[]) throws CloneNotSupportedException{
		Singleton2 s1 = Singleton2.instance1;
		Singleton2 s2= (Singleton2) s1.clone();
		
		System.out.println(s1.hashCode() + " -- " + s2.hashCode());
	}
}
