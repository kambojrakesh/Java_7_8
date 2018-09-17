package designPattern.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

///by adding read resolve we can stop the break down of singleton class in the of case serialization
public class SingletonWithSerialization {
	static String filePath = "E://w1/Test/src/designPattern/serializedState/studentstate.txt";
	public static void main(String []args) throws IOException, ClassNotFoundException{
		StudentSingleton student = StudentSingleton.getObject();
		student.setAge(11);
		student.setName("Rakesh");
		serializeState(student);
		System.out.println(student.hashCode());
		
		StudentSingleton studentSingleton  = deserializeState();
		System.out.println(studentSingleton.hashCode());
	
	}

	private static StudentSingleton deserializeState() throws IOException, ClassNotFoundException {
		return (StudentSingleton)new ObjectInputStream(new FileInputStream(filePath)).readObject();
	}

	private static void serializeState(StudentSingleton student) throws IOException {
		FileOutputStream stream = new FileOutputStream(filePath);
		ObjectOutputStream objectStream = new ObjectOutputStream(stream);
		objectStream.writeObject(student);
		objectStream.flush();		
	}
}

class StudentSingleton implements Serializable{
	
	static StudentSingleton singleton;
	int age;
	String name;
	
	private StudentSingleton(){}
	
	public static StudentSingleton getObject(){
		if(singleton == null) {
			synchronized (StudentSingleton.class) {
				if(singleton == null){
					singleton = new StudentSingleton();
				}
			}
		}
		return singleton;
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
	//by adding read resolve we can stop the break down of singleton class in the of case serialization
	public Object readResolve(){
		return singleton;
		
	}
}
