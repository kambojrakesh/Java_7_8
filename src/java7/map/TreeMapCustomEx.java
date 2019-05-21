package java7.map;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
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
		if(this.i > o.i)
			return 1;
		else if(this.i < o.i)
			return -1;

		return 0;
	}
}

public class TreeMapCustomEx {

	public static void main(String[] args) {
		TreeMap<Student,Integer> ts = new TreeMap();
		ts.put(new Student(10, "rakesh"),1);
		ts.put(new Student(1, "rikki"),8);
		ts.put(new Student(12, "vikki"),3);

		for(Map.Entry me:ts.entrySet()){
			System.out.println(me.getKey() + "----" + me.getValue());
		}
	}
}
