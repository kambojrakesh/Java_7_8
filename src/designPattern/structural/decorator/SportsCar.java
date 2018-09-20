package designPattern.structural.decorator;

public class SportsCar extends CarDecorator{
	SportsCar(Car car) {
		super(car);
		this.car = car;
	}

	@Override
	public void assemble() {
		car.assemble();
		System.out.print(" - SportsCar");
	}
}
