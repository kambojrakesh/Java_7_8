package designPattern.factory;

public class Factory {

	public static Computer getInstance(String name,String ram,String harddisk){
		Computer com = null;
		if("Pc".equals(name)) {
			com = new Pc(ram, harddisk);
		} else if("Server".equals(name)) {
			com = new Server(ram, harddisk);
		}
		return com;
		
	}
}
