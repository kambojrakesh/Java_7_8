package designPattern.strategy;

class TestStatergy {
	public static void main(String obj[]){
		Context context1=new Context(new NoDiscountStrategy());
		Context context2=new Context(new MonthlyDiscountStrategy());
		
		context1.callStrategy(2);
		context2.callStrategy(9);
	}
}
