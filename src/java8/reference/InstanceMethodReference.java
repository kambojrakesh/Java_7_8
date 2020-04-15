package java8.reference;

@FunctionalInterface
interface MyInterface1 {
	void display();
}

public class InstanceMethodReference {
	public void myMethod() {
		System.out.println("Instance Method");
	}

	public static void main(String[] args) {
		InstanceMethodReference obj = new InstanceMethodReference();
		// Method reference using the object of the class
		MyInterface1 ref = obj::myMethod;
		// Calling the method of functional interface
		ref.display();
	}
}