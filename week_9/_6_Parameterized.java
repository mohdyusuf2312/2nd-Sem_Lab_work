package week_9;

class Box {
    double length;
    double width;
    double height;

    // Constructor
    Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    // Method to calculate the volume of the box
    double calculateVolume() {
        return length * width * height;
    }
}

public class _6_Parameterized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box box1 = new Box(5, 3, 2);
        Box box2 = new Box(4, 6, 2.5);

        // Calculating and printing volumes
        System.out.println("Volume of Box 1: " + box1.calculateVolume());
        System.out.println("Volume of Box 2: " + box2.calculateVolume());
	}

}
