package designPattern.abstractFactory.type;

import designPattern.abstractFactory.parent.Car;

public class MiniFactoryCar extends Car{

	public MiniFactoryCar(String loc,String type) {
		super(loc,type);
		construct();
	}

	private void construct() {
		System.out.println("Building car factory.");	
	}
}
