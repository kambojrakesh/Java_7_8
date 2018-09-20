package designPattern.creational.abstractFactory;


public class AsiaFactoryCar{
	public static Car buildCar(String type) {
		Car car =  null;
		switch(type){
			case "MINI":
				car = new MiniFactoryCar("ASIA",type);
				break;
			case "LUXARY":
				car = new LuxaryFactoryCar("ASIA",type);
				break;
		}
		
		return car;
	}

}
