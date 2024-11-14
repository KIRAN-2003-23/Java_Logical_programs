
import java.util.HashMap;
import java.util.Map;

public class UniqueElements {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 4, 4, 5, 6};
        
        // Using HashMap to store frequencies of elements
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        
        // Counting frequency of each element
        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        // Displaying unique elements
        System.out.println("Unique elements in the array:");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == 1) {  // Only print elements with frequency 1
                System.out.println(entry.getKey());
            }
        }
    }
}
