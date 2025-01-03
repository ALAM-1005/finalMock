package test3;

//Hybrid Class
class TrainingManager extends Trainer implements Manager {
 int teamSize;

 // Constructor for TrainingManager
 TrainingManager(String name, int empId, String course, int teamSize) {
	 
	 
     super(name, empId, course); // Constructor chaining to Trainer
     this.teamSize = teamSize;
     System.out.println("TrainingManager Constructor: " + teamSize);
 }

 @Override
 public void manage() {
     System.out.println("Managing team of size: " + teamSize);
 }
}
