package designPattern.behavioral.strategy;

public class Context {
	StrategyDesign strategy = null;
	
	Context(StrategyDesign strategy){
		this.strategy = strategy;
	}
	
	public void callStrategy(int no){
		if(no > 6){
			strategy.isDiscount();
		} else{
			strategy.isDiscount();
		}
	}
}
