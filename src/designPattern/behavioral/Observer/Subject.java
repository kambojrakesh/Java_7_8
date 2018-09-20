package designPattern.behavioral.Observer;

import java.util.ArrayList;

public class Subject {

	ArrayList<ObserverCheck> observers = new ArrayList<ObserverCheck>();
	private int state;
	
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
		notifyAllObservers();
	}
	
	public void attach(ObserverCheck obs){
		observers.add(obs);
	}
	
	public void notifyAllObservers(){

	      for (ObserverCheck observer : observers) {
	    	  	observer.update(this.state);
	       }
	}	
}
