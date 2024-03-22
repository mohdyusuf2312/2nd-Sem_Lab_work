package week_8;
import java.util.Scanner;

class Vehicle {
    private String company;
    private double price;

    public Vehicle(String company, double price) {
        this.company = company;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Company: " + company + ", Price: $" + price;
    }
}

class LightMotorVehicle extends Vehicle {
    private double mileage;

    public LightMotorVehicle(String company, double price, double mileage) {
        super(company, price);
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return super.toString() + ", Mileage: " + mileage + " km/l";
    }
}

class HeavyMotorVehicle extends Vehicle {
    private double capacityInTons;

    public HeavyMotorVehicle(String company, double price, double capacityInTons) {
        super(company, price);
        this.capacityInTons = capacityInTons;
    }

    @Override
    public String toString() {
        return super.toString() + ", Capacity: " + capacityInTons + " tons";
    }
}
public class _3_Vehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of vehicles: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Vehicle[] vehicles = new Vehicle[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Vehicle " + (i + 1) + ":");
            System.out.print("Enter company: ");
            String company = scanner.nextLine();
            System.out.print("Enter price: $");
            double price = scanner.nextDouble();
            scanner.nextLine(); // Consume newline
            System.out.print("Enter type of vehicle (L for Light Motor Vehicle, H for Heavy Motor Vehicle): ");
            char type = scanner.nextLine().charAt(0);

            switch (type) {
                case 'L':
                case 'l':
                    System.out.print("Enter mileage (km/l): ");
                    double mileage = scanner.nextDouble();
                    vehicles[i] = new LightMotorVehicle(company, price, mileage);
                    break;
                case 'H':
                case 'h':
                    System.out.print("Enter capacity (in tons): ");
                    double capacity = scanner.nextDouble();
                    vehicles[i] = new HeavyMotorVehicle(company, price, capacity);
                    break;
                default:
                    System.out.println("Invalid vehicle type. Please enter either L or H.");
                    i--; // Decrement i to redo the input for this vehicle
                    break;
            }
            scanner.nextLine(); // Consume newline
        }

        System.out.println("\nVehicle Information:");
        for (int i = 0; i < n; i++) {
            System.out.println("Vehicle " + (i + 1) + ": " + vehicles[i]);
        }
	}

}
