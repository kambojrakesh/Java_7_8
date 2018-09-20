package designPattern.creational.abstractFactory;


public abstract class Car {
	String location;
	String type;
	
	protected Car(String location, String type){
		this.location = location;
		this.type = type;
	}
	@Override
	public String toString(){
		return type + " car build is in process at location - " + location;
	}
}
