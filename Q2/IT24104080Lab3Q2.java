

import java.util.Scanner;

public class IT24104080Lab3Q2 {
    public static void main(String[] args) {
        // Create a scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Input the monthly salary
        System.out.print("Enter the monthly salary: ");
        double monthlySalary = scanner.nextDouble();

        // Input the number of OT hours worked
        System.out.print("Enter the number of OT hours worked: ");
        double otHours = scanner.nextDouble();

        // Input the OT hourly rate
        System.out.print("Enter the OT hourly rate: ");
        double otHourlyRate = scanner.nextDouble();

        // Calculate OT amount
        double otAmount = otHours * otHourlyRate;

        // Calculate total salary
        double totalSalary = monthlySalary + otAmount;

        // Output the OT amount and the total salary
        System.out.println("\nOT Amount: " + otAmount);
        System.out.println("Total Salary: " + totalSalary);

        // Close the scanner object to prevent memory leaks
        scanner.close();
    }
}
