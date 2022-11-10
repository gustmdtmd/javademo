package youtube;

import java.util.*;

public class Hashset2 {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		
		set.add("abc");
		set.add("abc");
		set.add(new Person("David",10));
		set.add(new Person("David",10));
		
		System.out.println(set);
	}
	

}
class Person{
	String name;
	int age;
	
	public int hashCode() {
		return Objects.hash(name, age);
	}
	
	public boolean equals(Object obj) {
		if(!(obj instanceof Person)) return false;
		
		Person p = (Person)obj;
		return this.name.equals(p.name) && this.age==p.age;
	}
	
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
@Override
	public String toString() {
		return name + ":" + age;
	}
}