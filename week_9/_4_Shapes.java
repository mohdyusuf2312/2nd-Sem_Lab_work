package week_9;

//Interface for common shape methods
interface Shape {
 double calculateArea();
 double calculatePerimeter();
}

//Class representing a circle
class Circle implements Shape {
 private double radius;

 // Constructor
 public Circle(double radius) {
     this.radius = radius;
 }

 // Implementing interface methods
 public double calculateArea() {
     return Math.PI * radius * radius;
 }

 public double calculatePerimeter() {
     return 2 * Math.PI * radius;
 }
}

//Class representing a rectangle
class Rectangle implements Shape {
 private double length;
 private double width;

 // Constructor
 public Rectangle(double length, double width) {
     this.length = length;
     this.width = width;
 }

 // Implementing interface methods
 public double calculateArea() {
     return length * width;
 }

 public double calculatePerimeter() {
     return 2 * (length + width);
 }
}


public class _4_Shapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);

        // Displaying area and perimeter for Circle
        System.out.println("Circle:");
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimeter: " + circle.calculatePerimeter());

        // Displaying area and perimeter for Rectangle
        System.out.println("\nRectangle:");
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
	}

}
