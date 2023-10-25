import java.util.Scanner;

public class ActivityThreeGinolos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double usdToPhp = 56.00;
        double totalCost = 0;
        int totalQuantity = 0;

        // Display the menu
        System.out.println("Menu:");
        System.out.println("C1 = Php 100.00");
        System.out.println("C2 = Php 150.00");
        System.out.println("C3 = Php 200.00");
        System.out.println("Add-ons:");
        System.out.println("R1 = Php 35.00");
        System.out.println("R2 = Php 50.00");

        while (true) {
            // Accept user input for order code and quantity
            System.out.print("Enter Order Code (or 'q' to quit): ");
            String orderCode = scanner.nextLine().trim().toUpperCase();

            if (orderCode.equals("Q")) {
                break; // Exit the loop if 'q' is entered
            }

            System.out.print("Enter Quantity: ");
            int quantity = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            // Calculate the cost based on the order code and quantity
            double cost = 0;
            switch (orderCode) {
                case "C1":
                    cost = 100.00 * quantity;
                    break;
                case "C2":
                    cost = 150.00 * quantity;
                    break;
                case "C3":
                    cost = 200.00 * quantity;
                    break;
                case "R1":
                    cost = 35.00 * quantity;
                    break;
                case "R2":
                    cost = 50.00 * quantity;
                    break;
                default:
                    System.out.println("Invalid Order Code. Please enter a valid code.");
                    continue; // Skip the rest of the loop
            }

            // Update total cost and quantity
            totalCost += cost;
            totalQuantity += quantity;

            // Display the order details
            System.out.println("Order Code: " + orderCode);
            System.out.println("Quantity: " + quantity);
            System.out.println("Total Cost: Php " + cost);
        }

        // Display the final total price and quantity
        System.out.println("Total Quantity: " + totalQuantity);
        System.out.println("Total Price (PHP): Php " + totalCost);
        double totalUsd = totalCost / usdToPhp;
        System.out.println("Total Price (USD): $" + totalUsd);

        // Close the scanner
        scanner.close();
    }
}