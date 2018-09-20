package designPattern.creational.abstractFactory.location;

import designPattern.creational.abstractFactory.parent.Car;
import designPattern.creational.abstractFactory.type.LuxaryFactoryCar;
import designPattern.creational.abstractFactory.type.MiniFactoryCar;

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
