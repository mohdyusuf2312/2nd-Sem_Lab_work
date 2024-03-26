package week_9;

class Fruit {
    // Attributes
    String name;
    String type; // Single fruit or bunch fruit

    // Constructor
    Fruit(String name, String type) {
        this.name = name;
        this.type = type;
    }

    // Method to display fruit attributes
    void displayFruit() {
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
    }
}
public class _2_Fruit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit fruit1 = new Fruit("Apple", "Single fruit");
        Fruit fruit2 = new Fruit("Banana", "Bunch fruit");

        // Displaying attributes of each fruit
        System.out.println("Fruit 1:");
        fruit1.displayFruit();

        System.out.println("\nFruit 2:");
        fruit2.displayFruit();
	}

}
