package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializeTest {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		//writeObj();
		Person person = readObj();
		System.out.println("person:"+person.toString());

	}
	
	public static Person readObj() throws FileNotFoundException, IOException, ClassNotFoundException{
		ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("demo.txt"));
		Person person = (Person)objectInputStream.readObject();
		return person;
	}
	public static void writeObj() throws FileNotFoundException, IOException{
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("demo.txt"));
		objectOutputStream.writeObject(new Person(11,"22"));
		objectOutputStream.close();
	}

}
	class Person implements Serializable{
		int age;
		String name;
		public Person(int age,String name){
			this.age = age;
			this.name = name;
		}
		@Override
		public String toString() {
			return "Person [age=" + age + ", name=" + name + "]";
		}
		
	}
