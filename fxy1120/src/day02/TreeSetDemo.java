package day02;

import java.util.Set;
import java.util.TreeSet;
class Person implements Comparable<Person>{
	private String name;
	private int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		}
	public int compareTo(Person other){
		if(this.name.length()>other.name.length()){
			return 1;
		}else if(this.name.length()<other.name.length()){
			return -1;
		}
	return 0;	
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age="
				+ age + "]";
	}
/*
class Person {
public String name;
public int age;
public Person(String name, int age) {
	super();
	this.name = name;
	this.age = age;
	}

@Override
public String toString() {
	return "Person [name=" + name + ", age="
			+ age + "]";
}
}
	
	class NameComparator implements Comparator<Person>{
	@Override
	public int compare(Person o1, Person o2) {
		if(o1.name.length()>o2.name.length()){
			return 1;
		}else if(o1.name.length()<o2.name.length()){
			return -1;
		}
	return 0;	
	}*/
	
}
public class TreeSetDemo {
	public static void main(String[] args) {
	Set<Person> set=new TreeSet<>();
	set.add(new Person("小明12", 15));
	set.add(new Person("小明1", 138));
	set.add(new Person("小明12345", 18));
	set.add(new Person("小明1234", 17));
	System.out.println(set);
	}
	

}
