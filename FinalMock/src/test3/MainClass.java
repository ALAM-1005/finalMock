package test3;

public class MainClass {

	 public static void main(String[] args) {
	        // Constructor chaining
	        TrainingManager manager = new TrainingManager("Alice", 101, "Java", 5);

	        // Non-primitive typecasting
	        // Upcasting
	        Person person = manager; // Upcasting TrainingManager to Person
	        System.out.println("Upcasting: Person name is " + person.name);

	        // Downcasting
		 System.out.println("here is done about downcasting");
	        if (person instanceof TrainingManager) {
	            TrainingManager downcastedManager = (TrainingManager) person; // Downcasting Person to TrainingManager
	            downcastedManager.manage();
	        }
	    }
}
