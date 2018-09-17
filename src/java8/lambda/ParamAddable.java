package java8.lambda;
@FunctionalInterface
interface Addable {
	public int getAddition(int i,int j);
}
public class ParamAddable {
	public static void main(String[] args) {
		/*Addable ad = (int i, int j)->{	
			return i + j; 
		};
		System.out.println(ad.getAddition(12, 14));*/
		
		
		Addable ad = (int i, int j)-> i+ j;
		
		System.out.println(ad.getAddition(11, 11));

	}
}
