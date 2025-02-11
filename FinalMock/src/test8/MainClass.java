package test8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class MainClass {

	public static void main(String[] args) {
		
		
		ArrayList<Person> al = new ArrayList<Person>();

		al.add(new Tester("David", 60000));
		al.add(new DevopsEngineer("Eve", 28));
		al.add(new DevopsEngineer("Frank", 30));
		al.add(new Developer("zlice", 101));
		al.add(new Developer("Bob", 102));
		al.add(new Tester("Charlie", 50000));
		
		
        // Sorting using the custom comparator
        Collections.sort(al, new PersonComparator());

        // Printing details using an iterator
        Iterator<Person> i = al.iterator();
        while (i.hasNext()) {
            Person p = i.next();
            if (p instanceof Developer) {
                Developer dev = (Developer) p;
                System.out.println("Developer - Name: " + dev.name + ", ID: " + dev.id);
            } else if (p instanceof Tester) {
                Tester tester = (Tester) p;
                System.out.println("Tester - Name: " + tester.name + ", Salary: " + tester.salary);
            } else if (p instanceof DevopsEngineer) {
                DevopsEngineer devops = (DevopsEngineer) p;
                System.out.println("DevOps Engineer - Name: " + devops.name + ", Age: " + devops.age);
            }
        }
    }
}