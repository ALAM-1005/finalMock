package test8;

import java.util.Comparator;



public class PersonComparator implements Comparator<Person> {

	@Override
	public int compare(Person p1, Person p2) {
        String name1 = "";
        String name2 = "";

        if (p1 instanceof Developer) {
            name1 = ((Developer) p1).name;
        } else if (p1 instanceof Tester) {
            name1 = ((Tester) p1).name;
        } else if (p1 instanceof DevopsEngineer) {
            name1 = ((DevopsEngineer) p1).name;
        }

        if (p2 instanceof Developer) {
            name2 = ((Developer) p2).name;
        } else if (p2 instanceof Tester) {
            name2 = ((Tester) p2).name;
        } else if (p2 instanceof DevopsEngineer) {
            name2 = ((DevopsEngineer) p2).name;
        }

        return name1.compareTo(name2);  // Sort alphabetically
    }
		
}
