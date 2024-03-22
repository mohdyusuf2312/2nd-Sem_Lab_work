package week_7;
//Interface for common methods
interface ShapeInterface {
 double area();
 double perimeter();
}

//Base class Shape
abstract class Shape {
 // Common methods
 abstract double area();
 abstract double perimeter();
}

//Class for Circle
class Circle extends Shape implements ShapeInterface {
 private double radius;

 // Constructor
 public Circle(double radius) {
     this.radius = radius;
 }

 // Implementing common methods
 @Override
 public double area() {
     return Math.PI * radius * radius;
 }

 @Override
 public double perimeter() {
     return 2 * Math.PI * radius;
 }
}

//Class for Rectangle
class Rectangle extends Shape implements ShapeInterface {
 private double width;
 private double height;

 // Constructor
 public Rectangle(double width, double height) {
     this.width = width;
     this.height = height;
 }

 // Implementing common methods
 @Override
 public double area() {
     return width * height;
 }

 @Override
 public double perimeter() {
     return 2 * (width + height);
 }
}

//Class for Triangle
class Triangle extends Shape implements ShapeInterface {
 private double side1;
 private double side2;
 private double side3;

 // Constructor
 public Triangle(double side1, double side2, double side3) {
     this.side1 = side1;
     this.side2 = side2;
     this.side3 = side3;
 }

 // Implementing common methods
 @Override
 public double area() {
     double s = (side1 + side2 + side3) / 2;
     return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
 }

 @Override
 public double perimeter() {
     return side1 + side2 + side3;
 }
}
public class _4_ClassesForShapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 	Circle circle = new Circle(5);
	        System.out.println("Circle Area: " + circle.area());
	        System.out.println("Circle Perimeter: " + circle.perimeter());

	        Rectangle rectangle = new Rectangle(4, 6);
	        System.out.println("Rectangle Area: " + rectangle.area());
	        System.out.println("Rectangle Perimeter: " + rectangle.perimeter());

	        Triangle triangle = new Triangle(3, 4, 5);
	        System.out.println("Triangle Area: " + triangle.area());
	        System.out.println("Triangle Perimeter: " + triangle.perimeter());
	}

}
