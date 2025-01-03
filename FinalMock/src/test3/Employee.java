package test3;

//Derived Class 1
class Employee extends Person {
    int empId;

    // Constructor for Employee
    Employee(String name, int empId) {
        super(name); // Constructor chaining to Person
        this.empId = empId;
        System.out.println("Employee Constructor: " + empId);
    }
}

