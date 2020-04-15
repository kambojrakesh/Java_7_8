package java8.reference;

@FunctionalInterface 
interface MyInterface{  
    Hello display(String say);  
}  
class Hello{  
    public Hello(String say){  
        System.out.print(say);  
    }  
}  
public class ConstructorReference {  
    public static void main(String[] args) { 
    	//Method reference to a constructor
        MyInterface ref = Hello::new;  
        ref.display("Hello World!");  
    }  
}