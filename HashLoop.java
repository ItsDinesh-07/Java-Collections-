import java.util.HashSet;
public class HashLoop {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();

        // Add elements to the HashSet
        for (int i = 0; i < 15; i++) {
            if(i % 2 == 0){
                continue;
                
            }
            numbers.add(i);
        }

        
        

        // Display the HashSet
        System.out.println("HashSet: " + numbers);
    }
}