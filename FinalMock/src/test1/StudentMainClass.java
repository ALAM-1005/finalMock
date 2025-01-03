package test1;

import java.util.HashSet;
import java.util.Iterator;

public class StudentMainClass {
	public static void main(String[] args) {
        // Create a HashSet of students
        HashSet<Student> students = new HashSet<>();

        // Add student objects
        students.add(new Student(1, "Alice", 85));
        students.add(new Student(2, "Bob", 90));
        students.add(new Student(3, "Charlie", 85)); // Duplicate marks
        students.add(new Student(4, "David", 95));
        students.add(new Student(5, "Eve", 90)); // Duplicate marks

        // Print the students
//        for (Student student : students) {
//            System.out.println(student);
//        }
        
        Iterator<Student> i = students.iterator();
        
        while(i.hasNext()) {
        	
        	Student student = i.next();
        	System.out.println(student);
        }
    }

	
	
}
