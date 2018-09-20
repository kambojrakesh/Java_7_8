package designPattern.structural.decorator;

public class TestDecorator {
	public static void main(String obj[]){
		Car c=new LuxaryCar(new BasicCar());
		c.assemble();
		System.out.println("\n*****");
		Car s=new SportsCar(new LuxaryCar(new BasicCar()));
		s.assemble();
	}
}
