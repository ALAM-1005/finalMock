package test4;

public class Developers extends Employee {

	
	public Developers(int eId, String eName, String email) {
		super(eId, eName, email);
		
	}

	void dev() {
		
		System.out.println("This is developer");
	}
}
