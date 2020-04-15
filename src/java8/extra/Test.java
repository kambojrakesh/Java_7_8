import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) throws IllegalAccessException {
		ArrayList<String> al = new ArrayList<String>();
		al.add("rakesh");
		al.add("vikram");
		al.add("anju");
		
		
		//al.stream().filter(a -> true).map(a -> a.substring(1)).forEach(System.out::println);
		
		
		//al1.forEach(System.out::println);
		
		Optional<Integer> i = Optional.empty();
		System.out.println(i);
		
		Optional<Integer> i1 = Optional.of(6);
		System.out.println(i1);
		
		i1.ifPresent(System.out::println);
		
		Optional<Company> optionalCompany = Optional.empty();
		
		Company company = optionalCompany.orElse(new Company());
		
		Company company1=optionalCompany.orElseThrow(IllegalAccessException::new);
		
	}

}
class Company{
	int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
