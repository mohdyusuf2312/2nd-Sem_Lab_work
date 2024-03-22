package week_8;
class Person {
    private String name;
    private int yearOfBirth;

    public Person(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Year of Birth: " + yearOfBirth;
    }
}

class Student extends Person {
    private String major;

    public Student(String name, int yearOfBirth, String major) {
        super(name, yearOfBirth);
        this.major = major;
    }

    @Override
    public String toString() {
        return super.toString() + ", Major: " + major;
    }
}

class Instructor extends Person {
    private double salary;

    public Instructor(String name, int yearOfBirth, double salary) {
        super(name, yearOfBirth);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + ", Salary: " + salary;
    }
}
public class _1_Inherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student("Yusuf", 1998, "Computer Science");
        Instructor instructor = new Instructor("Shuja", 1999, 60000);

        // Print information
        System.out.println("Student Information:");
        System.out.println(student);

        System.out.println("\nInstructor Information:");
        System.out.println(instructor);
	}

}
