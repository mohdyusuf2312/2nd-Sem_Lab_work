package week_8;

import java.util.Scanner;

class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;

    // Default constructor
    public Employee() {
        id = 0;
        name = "";
        department = "";
        salary = 0.0;
    }

    // Parameterized constructor
    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public void accept() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ID: ");
        id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Name: ");
        name = scanner.nextLine();
        System.out.print("Enter Department: ");
        department = scanner.nextLine();
        System.out.print("Enter Salary: ");
        salary = scanner.nextDouble();
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }

    public double getSalary() {
        return salary;
    }
}

class Manager extends Employee {
    private double bonus;

    public Manager() {
        super();
        bonus = 0.0;
    }

    public Manager(int id, String name, String department, double salary, double bonus) {
        super(id, name, department, salary);
        this.bonus = bonus;
    }

    @Override
    public void accept() {
        super.accept();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Bonus: ");
        bonus = scanner.nextDouble();
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Bonus: " + bonus);
    }

    public double getTotalSalary() {
        return getSalary() + bonus;
    }
}
public class _2_MaximumTotalSalery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of managers: ");
        int n = scanner.nextInt();

        Manager[] managers = new Manager[n];
        double maxTotalSalary = Double.NEGATIVE_INFINITY;
        Manager maxSalaryManager = null;

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Manager " + (i + 1) + ":");
            Manager manager = new Manager();
            manager.accept();
            managers[i] = manager;
            double totalSalary = manager.getTotalSalary();
            if (totalSalary > maxTotalSalary) {
                maxTotalSalary = totalSalary;
                maxSalaryManager = manager;
            }
        }

        System.out.println("\nManager with maximum total salary:");
        if (maxSalaryManager != null) {
            maxSalaryManager.display();
        } else {
            System.out.println("No managers entered.");
        }
	}

}
