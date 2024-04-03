import java.io.*;
import java.util.Scanner;

class Employee {
    int empNo;
    String name;
    char sex;
    double grossSalary;

    public Employee(int empNo, String name, char sex, double grossSalary) {
        this.empNo = empNo;
        this.name = name;
        this.sex = sex;
        this.grossSalary = grossSalary;
    }

    @Override
    public String toString() {
        return "Employee No: " + empNo + ", Name: " + name + ", Sex: " + sex + ", Gross Salary: " + grossSalary;
    }
}

public class EmployeeManagement {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String fileName = "employee_data.txt";
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Create a file of employee data");
            System.out.println("2. Append data of a new employee");
            System.out.println("3. Delete a record of an employee");
            System.out.println("4. Update gross salary of an employee");
            System.out.println("5. Display record of:");
            System.out.println("   a. Given employee");
            System.out.println("   b. All employees");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    createEmployeeFile(fileName);
                    break;
                case 2:
                    appendEmployeeData(fileName);
                    break;
                case 3:
                    deleteEmployeeRecord(fileName);
                    break;
                case 4:
                    updateGrossSalary(fileName);
                    break;
                case 5:
                    displayRecord(fileName);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 6.");
            }
        }
    }

    private static void createEmployeeFile(String fileName) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            System.out.print("Enter Employee No: ");
            int empNo = scanner.nextInt();
            scanner.nextLine();  // Consume newline
            System.out.print("Enter Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter Sex (M/F): ");
            char sex = scanner.nextLine().charAt(0);
            System.out.print("Enter Gross Salary: ");
            double grossSalary = scanner.nextDouble();

            writer.println(empNo + "," + name + "," + sex + "," + grossSalary);
            System.out.println("Employee data saved to file.");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

    private static void appendEmployeeData(String fileName) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName, true))) {
            System.out.print("Enter Employee No: ");
            int empNo = scanner.nextInt();
            scanner.nextLine();  // Consume newline
            System.out.print("Enter Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter Sex (M/F): ");
            char sex = scanner.nextLine().charAt(0);
            System.out.print("Enter Gross Salary: ");
            double grossSalary = scanner.nextDouble();

            writer.println(empNo + "," + name + "," + sex + "," + grossSalary);
            System.out.println("Employee data appended to file.");
        } catch (IOException e) {
            System.err.println("Error appending to file: " + e.getMessage());
        }
    }

    private static void deleteEmployeeRecord(String fileName) {
        try {
            File inputFile = new File(fileName);
            File tempFile = new File("temp.txt");

            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            PrintWriter writer = new PrintWriter(new FileWriter(tempFile));

            System.out.print("Enter Employee No to delete: ");
            int empNoToDelete = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                int empNo = Integer.parseInt(parts[0]);
                if (empNo != empNoToDelete) {
                    writer.println(line);
                }
            }
            reader.close();
            writer.close();
            inputFile.delete();
            tempFile.renameTo(inputFile);
            System.out.println("Employee record deleted.");
        } catch (IOException e) {
            System.err.println("Error deleting record: " + e.getMessage());
        }
    }

    private static void updateGrossSalary(String fileName) {
        try {
            File inputFile = new File(fileName);
            File tempFile = new File("temp.txt");

            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            PrintWriter writer = new PrintWriter(new FileWriter(tempFile));

            System.out.print("Enter Employee No to update salary: ");
            int empNoToUpdate = scanner.nextInt();
            scanner.nextLine();  // Consume newline
            System.out.print("Enter new Gross Salary: ");
            double newGrossSalary = scanner.nextDouble();

            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                int empNo = Integer.parseInt(parts[0]);
                if (empNo == empNoToUpdate) {
                    parts[3] = String.valueOf(newGrossSalary);
                    line = String.join(",", parts);
                }
                writer.println(line);
            }
            reader.close();
            writer.close();
            inputFile.delete();
            tempFile.renameTo(inputFile);
            System.out.println("Gross salary updated.");
        } catch (IOException e) {
            System.err.println("Error updating salary: " + e.getMessage());
        }
    }

    private static void displayRecord(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            System.out.print("Do you want to display record of (a) Given employee or (b) All employees? (a/b): ");
            char choice = scanner.nextLine().charAt(0);

            if (choice == 'a') {
                System.out.print("Enter Employee No to display record: ");
                int empNoToDisplay = scanner.nextInt();
                String line;
                boolean found = false;
                while ((line = reader.readLine()) != null) {
                    String[] parts = line.split(",");
                    int empNo = Integer.parseInt(parts[0]);
                    if (empNo == empNoToDisplay) {
                        System.out.println("Record found: " + line);
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Record not found for Employee No: " + empNoToDisplay);
                }
            } else if (choice == 'b') {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            } else {
                System.out.println("Invalid choice. Please enter 'a' or 'b'.");
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
