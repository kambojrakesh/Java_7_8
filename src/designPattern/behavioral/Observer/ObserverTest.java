package designPattern.behavioral.Observer;

public class ObserverTest {

	public static void main(String obj[]){
		    Subject sub=new Subject();
			new OctaObserver(sub);
			new HexaObserver(sub);
			
			sub.setState(12);
			
	}
}
