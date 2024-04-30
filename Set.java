import java.util.Set;
import java.util.HashSet;

public class Set {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // Creating a HashSet
        Set<String> stringSet = new HashSet<>();

        // Adding elements to the set
        stringSet.add("apple");
        stringSet.add("banana");
        stringSet.add("orange");

        // Adding a duplicate element (will be ignored)
        stringSet.add("apple");

        // Printing the set (order may vary)
        System.out.println("Set: " + stringSet);

        // Checking if an element is present
        System.out.println("Contains 'banana': " + stringSet.contains("banana"));

        // Removing an element
        stringSet.remove("banana");

        // Printing the set after removal
        System.out.println("Set after removal: " + stringSet);

        // Iterating over the set
        System.out.println("Iterating over the set:");
        for (String item : stringSet) {
            System.out.println(item);
        }
    }
}
