import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CustomSorting {
    public static void main(String[] args) {
        // Create a list of strings
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("apple");
        stringList.add("orange");
        stringList.add("banana");
        stringList.add("grape");
        stringList.add("cherry");


         // Sort in ascending order
         Collections.sort(stringList); // Natural order sorting
         System.out.println("Strings in ascending order:");
         for (String str : stringList) {
             System.out.println(str);
         }

         
        // Sort the list in descending order
        Collections.sort(stringList, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s2.compareTo(s1); // Reverse order comparison
            }
        });

        // Print the sorted list
        System.out.println("Strings in descending order:");
        for (String str : stringList) {
            System.out.println(str);
        }
    }
}
