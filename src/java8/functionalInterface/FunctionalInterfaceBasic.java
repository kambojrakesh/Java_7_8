package java8.functionalInterface;

interface SuperDisplay{
	default void superDisplay(){
		System.out.println("Super Display.");
	}
}
@FunctionalInterface
interface Display extends SuperDisplay{
	void display();

	int hashCode();
	String toString();
}
public class FunctionalInterfaceBasic implements Display{

	public static void main(String[] args) {
		Display ds=new FunctionalInterfaceBasic();
		ds.display();
	}

	@Override
	public void display() {
		System.out.println("Hello FunctionalInterface First Basic Program");
	}
}
