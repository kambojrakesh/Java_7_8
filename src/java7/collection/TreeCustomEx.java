package java7.collection;

import java.util.Iterator;
import java.util.TreeSet;

class Student implements Comparable<Student> {
	int i;
	String s;

	Student(int i, String s) {
		this.i = i;
		this.s = s;
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return 0;
	}
}

public class TreeCustomEx {

	public static void main(String[] args) {
		TreeSet<Student> ts = new TreeSet();
		ts.add(new Student(10, "rakesh"));
		ts.add(new Student(11, "rikki"));
		ts.add(new Student(12, "vikki"));

		Iterator itr = ts.iterator();

		while (itr.hasNext())
			System.out.println((Student) (itr.next()));
	}
}
