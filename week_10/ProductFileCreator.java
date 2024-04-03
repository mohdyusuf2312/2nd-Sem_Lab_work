import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ProductFileCreator {
    public static void main(String[] args) {
        String fileName = "product_details.txt";
        try {
            PrintWriter writer = new PrintWriter(new FileWriter(fileName));
            Scanner scanner = new Scanner(System.in);

            for (int i = 1; i <= 5; i++) {
                System.out.println("Enter details for Product " + i + ":");
                System.out.print("Product Code: ");
                int productCode = scanner.nextInt();
                System.out.print("Cost: ");
                double cost = scanner.nextDouble();
                System.out.print("Number of Items Available: ");
                int numItems = scanner.nextInt();

                // Write product details to the file
                writer.println(productCode + "," + cost + "," + numItems);
            }
            scanner.close();
            writer.close();
            System.out.println("Product details saved to file: " + fileName);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }

        displayRecord(fileName);
    }
    private static void displayRecord(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            // System.out.print("Do you want to display record of (a) Given employee or (b) All employees? (a/b): ");
            // char choice = scanner.nextLine().charAt(0);

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
