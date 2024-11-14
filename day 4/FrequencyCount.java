
 import java.util.HashMap;
import java.util.Map;

public class FrequencyCount {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 4, 4, 5, 5};
        
        // Using HashMap to store frequencies
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        
        // Counting frequency of each element
        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        // Displaying the frequency of each element
        System.out.println("Element frequencies:");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("Element " + entry.getKey() + ": " + entry.getValue() + " times");
        }
    }
}
