package test5;


public class person implements Comparable <person> {

	int age;
	String name;
	
	public person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}



	@Override
	public int compareTo(person p) {
		
		return this.age -p.age;
		
	}
}
