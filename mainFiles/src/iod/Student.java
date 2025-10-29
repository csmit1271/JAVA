package iod;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//marker interface 
//interface -> zero method -> marker interface 
//java?

public class Student implements Serializable {

	String firstName;
	String lastName;
	String email;
	transient String password;
	int age;

	public static void main(String[] args) throws Exception {

		Student s = new Student();
		s.firstName = "rock";
		s.lastName = "patel";
		s.email = "rock@gmail.com";
		s.password = "secret";
		s.age = 25;

		// s -> file write ->
		// write?
		// 100 students -> total write ?
		// 1:5
		// 100:500

		// bank
		// uni
		// i/o -> 16gb

		// firstName , lastName , email, password ,age

		// write(object{f l e p age })
		// write ? 500 students -> 500
		// 500->500*5=>2500

		// FileWriter fw = new FileWriter("data.txt");

		// serialization -> writing an instance[state] into a file
		// de-serialization

//		ObjectOutputStream 

		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data.txt"));
		oos.writeObject(s);// state
		oos.close();
		System.out.println("done");

		Student s1 = new Student();// fn ln em pwd age

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data.txt"));
		s1 = (Student) ois.readObject(); // Object
		// ?Student
		// Emp
		// Royal
		// Object

		// white
		// orange-base
		// green-base

		System.out.println(s1.firstName);// ?
		System.out.println(s1.lastName);
		System.out.println(s1.email);
		System.out.println(s1.password);
		System.out.println(s1.age);

		ois.close();
	}
}
