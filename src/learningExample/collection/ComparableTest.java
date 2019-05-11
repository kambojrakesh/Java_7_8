package learningExample.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class Student implements Comparable<Student>{
	
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
	@Override
	public int compareTo(Student s) {
		if(s.age > age)
			return 1;
		else if(s.age < age)
			return -1;
		
		return 0;
	}
}

public class ComparableTest {
	public static void main(String arg[]){
		ArrayList<Student> ar = new ArrayList();
		ar.add(new Student(29,"Rakesh"));
		ar.add(new Student(22,"rikki"));
		ar.add(new Student(28,"vikki"));
		ar.add(new Student(26,"anju"));
		Collections.sort(ar);
		for(Student s:ar){
			System.out.println(s.getAge() + "==" + s.getName());
		}
	}
}
