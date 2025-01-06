package test1;

import java.util.Objects;

public class Student {

	private int id, marks;
	private String name;
    
    

    // Constructor
    public Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    // Override equals to compare only marks
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return marks == student.marks && id == student.id;
    }

    // Override hashCode to hash based only on marks
    @Override
    public int hashCode() {
        return Objects.hash(marks);
    }
// override the toString method
    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "', marks=" + marks + '}';
    }
}
