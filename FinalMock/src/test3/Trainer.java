package test3;

//Derived Class 2
class Trainer extends Employee {
    String course;

    // Constructor for Trainer
    Trainer(String name, int empId, String course) {
        super(name, empId); // Constructor chaining to Employee
        this.course = course;
        System.out.println("Trainer Constructor: " + course);
    }
}
