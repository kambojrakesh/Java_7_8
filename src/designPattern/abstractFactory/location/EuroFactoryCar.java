package designPattern.abstractFactory.location;

import designPattern.abstractFactory.parent.Car;
import designPattern.abstractFactory.type.LuxaryFactoryCar;
import designPattern.abstractFactory.type.MiniFactoryCar;

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