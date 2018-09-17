package designPattern.abstractFactory;

import designPattern.abstractFactory.location.AsiaFactoryCar;
import designPattern.abstractFactory.location.EuroFactoryCar;
import designPattern.abstractFactory.parent.Car;

public class CarFactory {
	public static Car buildCar(String location, String type){
		Car car =  null;
		switch(location){
			case "ASIA":
				car = AsiaFactoryCar.buildCar(type);
				break;
			case "EURO":
				car = EuroFactoryCar.buildCar(type);
				break;
			default:
				break;
		}
		return car;
	}
}
