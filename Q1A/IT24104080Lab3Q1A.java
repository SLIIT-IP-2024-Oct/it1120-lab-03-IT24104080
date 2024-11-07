import java.util.Scanner;

public class IT24104080Lab3Q1A {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user for the price of 1 kg of rice
        System.out.print("Enter the price of 1 kg of rice: ");
        double pricePerKg = scanner.nextDouble();
        
        // Ask the user for the number of kilograms they want to buy
        System.out.print("Enter the number of kilograms you want to buy: ");
        double kilograms = scanner.nextDouble();
        
        // Calculate the total amount to pay
        double totalAmount = pricePerKg * kilograms;
        
        // Display the result in the format you want
        System.out.println("Price of 1 kg of rice is: " + pricePerKg);
        System.out.println("Number of kilograms you want to buy: " + kilograms);
        System.out.println("Total amount to pay: " + totalAmount);
        
        // Close the scanner
        scanner.close();
    }
}
