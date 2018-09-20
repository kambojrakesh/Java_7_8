package designPattern.structural.decorator;

public class LuxaryCar extends CarDecorator{
	private Car car;
	LuxaryCar(Car car){
		super(car);
		this.car = car;
	}
	@Override
	public void assemble() {
		car.assemble();
		System.out.print(" - LuxaryCar");
	}
}
