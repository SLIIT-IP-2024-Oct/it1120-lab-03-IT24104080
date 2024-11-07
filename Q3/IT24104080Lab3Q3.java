import java.util.Scanner;

public class IT24104080Lab3Q3 {
    public static void main(String[] args) {
        // Create a Scanner object to take input from user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the amount
        System.out.print("Enter the rupee amount: ");
        int amount = scanner.nextInt();
        
        // Denominations of currency
        int[] denominations = {5000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        
        // Loop through each denomination and calculate the count of each denomination
        for (int denomination : denominations) {
            int count = amount / denomination;  // Calculate how many notes of this denomination
            amount = amount % denomination;    // Update the remaining amount
            System.out.println(denomination + " Notes – " + count);  // Output the result
        }
        
        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
