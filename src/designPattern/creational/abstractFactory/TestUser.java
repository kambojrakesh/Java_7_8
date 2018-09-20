package designPattern.creational.abstractFactory;


public class TestUser {
	public static void main(String obj[]){
		System.out.println(CarFactory.buildCar("ASIA", "MINI"));
		System.out.println(CarFactory.buildCar("ASIA", "LUXARY"));
		System.out.println(CarFactory.buildCar("EURO", "MINI"));
		System.out.println(CarFactory.buildCar("EURO", "LUXARY"));
	}
}
