package singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Singleton1 implements Serializable{
	// public instance initialized when loading the class 
    public static Singleton1 instance = new Singleton1(); 
      
    private Singleton1()  
    { 
        // private constructor 
    } 
    // implement readResolve method 
    protected Object readResolve() 
    { 
        return instance; 
    } 	

}
public class SingletonSerilization {
	
	public static void main(String []obj){
			
		try {
			Singleton1 emp1 =  Singleton1.instance;	
			FileOutputStream fos = new FileOutputStream("C://Users//rakesh.k//git//Java//file//s.txt");
			ObjectOutput os = new ObjectOutputStream(fos);
			os.writeObject(emp1);
			os.close();
			
			ObjectInput oi= new ObjectInputStream(new FileInputStream("C://Users//rakesh.k//git//Java//file//s.txt"));
			Singleton1 emp2 = (Singleton1) oi.readObject();
			oi.close();
			
			System.out.println(emp2.hashCode() + ";;" + emp1.hashCode());
			
		}  catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
