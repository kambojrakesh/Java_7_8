package designPattern.factory;

import javax.activation.CommandObject;

public class Pc implements Computer {
	String ram;
	String harddisk;
	Pc(){}
	public Pc(String ram, String harddisk) {
		this.ram = ram;
		this.harddisk = harddisk;
	}

	@Override
	public String getRam() {
		return ram;
	}

	@Override
	public String getHardDisk() {
		return harddisk;
	}
	
	public void reflectdCall() {
		System.out.println("Pc");
	}
}
