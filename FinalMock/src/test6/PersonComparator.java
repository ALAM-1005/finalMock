package test6;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		if (o1 instanceof Student && o2 instanceof Student) {

			return Integer.compare(((Student) o1).rollNo, ((Student) o2).rollNo);

		} else if (o1 instanceof Employee && o2 instanceof Employee) {

			return Integer.compare(((Employee) o1).empID, ((Employee) o2).empID);

		} else if (o1 instanceof Student) {

			return -1; // Students come before Employees

		} else {

			return 1; // Employees come after Students
		}
	}

}
