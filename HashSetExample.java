import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        // Create a HashSet to store unique elements
        HashSet<String> set = new HashSet<>();

        // Add elements to the HashSet
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Apple"); // Duplicate element, will not be added

        // Display the HashSet
        System.out.println("HashSet: " + set);

        // Check if an element exists in the HashSet
       }
    }
