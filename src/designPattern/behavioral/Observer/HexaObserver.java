package designPattern.behavioral.Observer;

public class HexaObserver implements ObserverCheck{
	Subject sub;
	public HexaObserver(Subject sub) {
		this.sub=sub;
		this.sub.attach(this);
	}

	public void update(int state) {
		System.out.println("Hexa observer."+  state);
	}	
}
