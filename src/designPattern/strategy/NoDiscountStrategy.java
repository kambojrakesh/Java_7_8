package designPattern.strategy;

public class NoDiscountStrategy implements StrategyDesign{

	@Override
	public void isDiscount() {
		System.out.println("NoDiscount is given for Customer");
	}



}
