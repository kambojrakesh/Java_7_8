package designPattern.creational.builder;

public class Computer {
	
	private String ram;
	private String hdd;
	
	//optional
	private String isGraphicEnabled;
	private String isBluetoothEnabled;
	

	Computer(ComputerBuilder computerBuilder){
		this.ram=computerBuilder.ram;
		this.hdd = computerBuilder.hdd;
		this.isGraphicEnabled=computerBuilder.isGraphicEnabled;
		this.isBluetoothEnabled=computerBuilder.isBluetoothEnabled;
	}
	
	public String getIsBluetoothEnabled() {
		return isBluetoothEnabled;
	}
	public String getIsGraphicEnabled() {
		return isGraphicEnabled;
	}

	
	public static class ComputerBuilder {
		
		private String ram;
		private String hdd;
		
		//optional
		private String isGraphicEnabled;
		private String isBluetoothEnabled;
		

		ComputerBuilder(String ram,String hdd){
			this.ram=ram;
			this.hdd=hdd;
		}
		


		public ComputerBuilder setIsGraphicEnabled(String isGraphicEnabled) {
			this.isGraphicEnabled = isGraphicEnabled;
			return this;
		}

		public ComputerBuilder setIsBluetoothEnabled(String isBluetoothEnabled) {
			this.isBluetoothEnabled = isBluetoothEnabled;
			return this;
		}
		public Computer build(){
			return new Computer(this);
		}
	}
}
