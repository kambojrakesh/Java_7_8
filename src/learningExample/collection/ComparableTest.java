package learningExample.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class Student2 implements Comparable<Student2>{
	
	int age;
	String name;
	Student2(int age,String name){
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
	public int compareTo(Student2 s) {
		if(s.age > age)
			return 1;
		else if(s.age < age)
			return -1;
		
		return 0;
	}
}

public class ComparableTest {
	public static void main(String arg[]){
		ArrayList<Student2> ar = new ArrayList();
		ar.add(new Student2(29,"Rakesh"));
		ar.add(new Student2(22,"rikki"));
		ar.add(new Student2(28,"vikki"));
		ar.add(new Student2(26,"anju"));
		Collections.sort(ar);
		for(Student2 s:ar){
			System.out.println(s.getAge() + "==" + s.getName());
		}
	}
}
