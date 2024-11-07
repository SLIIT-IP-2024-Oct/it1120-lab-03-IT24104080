import java.util.Scanner;

public class IT24104080Lab3Q4 {
    public static void main(String[] args) {
        // Create a Scanner object to take input from user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a five-digit number
        System.out.print("Enter a five-digit number: ");
        int number = scanner.nextInt();
        
        // Check if the number is a five-digit number
        if (number >= 10000 && number <= 99999) {
            // Separate the digits using arithmetic operations
            int firstDigit = number / 10000;        // Extract the first digit
            int secondDigit = (number / 1000) % 10; // Extract the second digit
            int thirdDigit = (number / 100) % 10;   // Extract the third digit
            int fourthDigit = (number / 10) % 10;   // Extract the fourth digit
            int fifthDigit = number % 10;           // Extract the fifth digit
            
            // Print the digits separated by a space
            System.out.println(firstDigit + " " + secondDigit + " " + thirdDigit + " " + fourthDigit + " " + fifthDigit);
        } else {
            System.out.println("Please enter a valid five-digit number.");
        }
        
        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
