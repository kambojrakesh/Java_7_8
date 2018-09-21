package p;

import p.TestOuter.TestInner;
import p.TestOuter.TestInnerClass;
 
interface TestOuter{
	
	void displayOuter();
	
	interface TestInner{
		void displayInnner();
	}
	
	abstract class TestInnerAbstract{

		//void TestAbInner1(); must have to define method

		void TestAbInner() {
			System.out.println("TestAbInner");
		}
	}
	
	class TestInnerClass{
		void testInnerMethod(){
			System.out.println("Test Inner Class");
		}
		public static TestInnerClass getInstance(){
			return new TestInnerClass();
		}
	}
}  
public class TestNestedAbsInterface extends TestInnerClass implements TestInner,TestOuter{

	@Override
	public void displayOuter() {
		System.out.println("displayOuter");
	}
	
	public static void main(String obj[]){
		TestOuter test= new TestNestedAbsInterface();
		test.displayOuter();
		
		TestInner test1= new TestNestedAbsInterface();
		test1.displayInnner();
		
		/*TestInnerAbstract testInnerAbstract= new TestNestedAbsInterface();
		testInnerAbstract.TestAbInner();*/
		
		TestInnerClass p = new TestInnerClass();
		p.testInnerMethod();
		
		TestInnerClass testInnerClass = TestInnerClass.getInstance();
		testInnerClass.testInnerMethod();
	}

	@Override
	public void displayInnner() {
		System.out.println("displayInner");
		
	}
}