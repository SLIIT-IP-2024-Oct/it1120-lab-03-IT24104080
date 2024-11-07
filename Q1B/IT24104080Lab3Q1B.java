import java.util.Scanner;

public class IT24104080Lab3Q1B {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user for the price of 1 kg of rice
        System.out.print("Enter the price of 1 kg of rice: ");
        double pricePerKg = scanner.nextDouble();
        
        // Ask the user for the number of kilograms they want to buy
        System.out.print("Enter the number of kilograms you want to buy: ");
        double kilograms = scanner.nextDouble();
        
        // Calculate the total amount to pay before discount
        double totalAmount = pricePerKg * kilograms;
        
        // Calculate the discount (10% of the total amount)
        double discount = totalAmount * 0.10;
        
        // Calculate the final amount to pay after applying the discount
        double finalAmount = totalAmount - discount;
        
        // Display the result
        System.out.println("\nPrice of 1 kg of rice is: " + pricePerKg);
        System.out.println("Number of kilograms you want to buy: " + kilograms);
        System.out.println("Total amount before discount: " + totalAmount);
        System.out.println("Discount (10%): " + discount);
        System.out.println("Total amount to pay after discount: " + finalAmount);
        
        // Close the scanner
        scanner.close();
    }
}
