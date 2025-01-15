import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class WrapperClassSorting {
    public static void main(String[] args) {
        // Create a list of Integer (wrapper class for int)
        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(45);
        numberList.add(12);
        numberList.add(78);
        numberList.add(34);
        numberList.add(89);

        // Sort in ascending order
        Collections.sort(numberList); // Natural order sorting
        System.out.println("Numbers in ascending order:");
        for (Integer num : numberList) {
            System.out.println(num);
        }

        // Sort in descending order
        Collections.sort(numberList, new Comparator<Integer>() {
            @Override
            public int compare(Integer n1, Integer n2) {
                return n2.compareTo(n1); // Reverse order comparison
            }
        });
        System.out.println("\nNumbers in descending order:");
        for (Integer num : numberList) {
            System.out.println(num);
        }
    }
}
