import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args) {
        // Creating a HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Adding elements to the HashMap
        hashMap.put("John", 25);
        hashMap.put("Alice", 30);
        hashMap.put("Bob", 20);
        hashMap.put("Emily", 28);

        // Accessing elements
        System.out.println("Age of John: " + hashMap.get("John"));

        // Iterating over the HashMap
        System.out.println("\nIterating over the HashMap:");
        for (String name : hashMap.keySet()) {
            int age = hashMap.get(name);
            System.out.println(name + " is " + age + " years old.");
        }

        // Checking if a key exists
        String keyToCheck = "Bob";
        if (hashMap.containsKey(keyToCheck)) {
            System.out.println("\n" + keyToCheck + " is present in the HashMap.");
        } else {
            System.out.println("\n" + keyToCheck + " is not present in the HashMap.");
        }

        // Removing an element
        String keyToRemove = "Alice";
        hashMap.remove(keyToRemove);
        System.out.println("\nRemoved " + keyToRemove + " from the HashMap.");

        // Size of the HashMap
        System.out.println("\nSize of the HashMap: " + hashMap.size());
    }
}
