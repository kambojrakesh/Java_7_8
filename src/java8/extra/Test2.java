import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@FunctionalInterface
interface Company1 {
	public String say();
}

@FunctionalInterface
interface Company2 {
	public String say(int num);
}

public class Test2 {

	public static void main(String[] args) {
		Company1 company1 = () -> {
			return "hello";
		};
		System.out.println(company1.say());

		Company2 company2 = (num) -> {
			return "hello" + num;
		};
		System.out.println(company2.say(10));

		ArrayList<String> al = new ArrayList<String>();
		al.add("hello");
		al.add("anju");
		al.add("rani");

		al.forEach((value) -> System.out.println(value));
		
		
		
		Map<String, Integer> prices = new HashMap<>();
		prices.put("Apple", 50);
		prices.put("Orange", 20);
		prices.put("Banana", 10);
		prices.put("Grapes", 40);
		prices.put("Papaya", 50);
		
		
		prices.forEach((K,V)->System.out.println(K+"---"+V));
		
		ArrayList<String> ls = new ArrayList<String>();
		ls.add("rikki");
		ls.add("vikki");
		ls.add("yahoo");
		ls.add("anju");
		
		Map mp = ls.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		mp.forEach((k,v)->System.out.println(k+"------"+v));

	}
}
