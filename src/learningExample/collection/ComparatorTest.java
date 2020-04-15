package learningExample.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
	
	int age;
	String name;
	Student(int age,String name){
		 this.age=age;
		 this.name=name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int compareTo(Student s) {
		if(s.age > age)
			return 1;
		else if(s.age < age)
			return -1;
		
		return 0;
	}
}
class Compo implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {

		if(o1.getAge() > o2.getAge()){
			return 1;
		} else if(o1.getAge() < o2.getAge()){
			return -1;
		}
		return 0;
	}
	
}
public class ComparatorTest {
	public static void main(String arg[]){
		List<Student> ar = new ArrayList<Student>();
		ar.add(new Student(29,"Rakesh"));
		ar.add(new Student(22,"rikki"));
		ar.add(new Student(28,"vikki"));
		ar.add(new Student(26,"anju"));
		Collections.sort(ar, new Compo());
		for(Student s:ar){
			System.out.println(s.getAge() + "==" + s.getName());
		}
	}
}
