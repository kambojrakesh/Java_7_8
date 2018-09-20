package designPattern.creational.factory;

public class Server implements Computer {
	String ram;
	String harddisk;
	public Server(String ram, String harddisk) {
		this.ram = ram;
		this.harddisk = harddisk;
	}
	Server(){}
	@Override
	public String getRam() {
		return ram;
	}

	@Override
	public String getHardDisk() {
		return harddisk;
	}
	
	public void reflectdCall() {
		System.out.println("Server");
	}
}
