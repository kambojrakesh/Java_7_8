package designPattern.behavioral.Observer;


public class OctaObserver implements ObserverCheck{

	private Subject sub;

	public OctaObserver(Subject sub) {
		this.sub=sub;
		this.sub.attach(this);
	}

	public void update(int state) {
		System.out.println("Octa observer."+  state);
	}	
}
