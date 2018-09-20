package designPattern.creational.abstractFactory;


public class EuroFactoryCar {

	public static Car buildCar(String type) {
		Car car =  null;
		switch(type){
			case "MINI":
				car = new MiniFactoryCar("EURO",type);
				break;
			case "LUXARY":
				car = new LuxaryFactoryCar("EURO",type);
				break;
		}
		return car;
	}
}
