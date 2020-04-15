import java.util.ArrayList;
import java.util.stream.Collectors;

public class ArrayListEg {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("rakesh");
		al.add("vikram");
		al.add("anju");
		
		//ArrayList<String> al1= (ArrayList<String>) al.stream().map(a -> a.substring(1)).collect(Collectors.toList());
		
		al.stream().map(a -> a.substring(1)).forEach(System.out::println);
		
		
		//al1.forEach(System.out::println);
		
	}

}
