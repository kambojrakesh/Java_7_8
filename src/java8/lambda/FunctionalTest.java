package java8.lambda;
@FunctionalInterface
interface Drawable{
	public void show();
}
@FunctionalInterface
interface Calculator{
	public int add(int a, int b);
}
public class FunctionalTest {
	public static void main(String args[]){
		
		Drawable dr = () -> System.out.println("check");
		dr.show();		
		
		Calculator cal = (a,b) -> a + b;
		System.out.println(cal.add(12,15));
	}
}
