package designPattern.creational.builder;

public class TestBuilderDesign {
	
	public static void main(String args[]){
		Computer computer = new Computer.ComputerBuilder("12gb", "400TB").setIsBluetoothEnabled("C-tech bluetooth").build();
		System.out.println(computer.getIsBluetoothEnabled());
		System.out.println(computer.getIsGraphicEnabled());
	}
}
