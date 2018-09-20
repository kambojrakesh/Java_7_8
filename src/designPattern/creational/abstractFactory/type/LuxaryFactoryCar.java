package designPattern.creational.abstractFactory.type;

import designPattern.creational.abstractFactory.parent.Car;

public class LuxaryFactoryCar extends Car{

	public LuxaryFactoryCar(String loc,String type) {
		super(loc,type);
		construct();
	}

	private void construct() {
		System.out.println("Building car factory.");	
	}

}