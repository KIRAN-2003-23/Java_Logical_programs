import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Initial array
        int[] array = {1, 2, 3, 4, 5, 6};
        System.out.println("Original array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        
        System.out.print("\nEnter the position to delete (0-based index): ");
        int position = scanner.nextInt();
        
        // Check if the position is valid
        if (position < 0 || position >= array.length) {
            System.out.println("Invalid position!");
        } else {
            // Create a new array with one less element
            int[] newArray = new int[array.length - 1];
            
            // Copy elements except the one at the specified position
            for (int i = 0, j = 0; i < array.length; i++) {
                if (i != position) {
                    newArray[j++] = array[i];
                }
            }
            
            System.out.println("Array after deletion:");
            for (int num : newArray) {
                System.out.print(num + " ");
            }
        }
        
        scanner.close();
    }
}