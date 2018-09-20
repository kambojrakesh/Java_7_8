package designPattern.behavioral.strategy;

public class MonthlyDiscountStrategy implements StrategyDesign {

	@Override
	public void isDiscount() {
		System.out.println("10% discount is given for Customer");
	}

}
