import java.util.HashSet;
public class HashSet2 {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();

        numbers.add(1);
        numbers.add(2); 
        numbers.add(3);
        numbers.add(2); // Duplicate, will not be added

        System.out.println("HashSet: " + numbers);
    }
}