package test6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class MainClass {

	
	public static void main(String[] args) {
		
		
	ArrayList<Person> al  = new ArrayList<Person>();
	
	al.add(new Student(3, "Alice"));
        al.add(new Student(1, "Bob"));
        al.add(new Student(2, "Charlie"));
    
    
       al.add(new Employee(102, "John"));
       al.add(new Employee(101, "Jane"));

		
       Collections.sort(al, new PersonComparator());

        // Iterate over the combined and sorted list using a single Iterator
        Iterator<Person> iterator = al.iterator();
        while (iterator.hasNext()) {
           Person p = iterator.next();
            if (p instanceof Student) {
                Student student = (Student) p;
                System.out.println("Student - RollNo: " + student.rollNo + ", Name: " + student.name);
            } else if (p instanceof Employee) {
                Employee employee = (Employee) p;
                System.out.println("Employee - EmpId: " + employee.empID + ", Name: " + employee.name);
            }
	}
}
}
