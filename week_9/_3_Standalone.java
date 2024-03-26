package week_9;

//Interface 1
interface Interface1 {
	void method1();
}

//Interface 2
interface Interface2 {
	void method2();
}

//Class implementing both interfaces
class MyClass implements Interface1, Interface2 {
// Implementation of method1 from Interface1
	public void method1() {
		System.out.println("Implementation of method1");
	}	

// Implementation of method2 from Interface2
	public void method2() {
		System.out.println("Implementation of method2");
	}
}

public class _3_Standalone {
	// Creating an object of MyClass
	public static void main() {
		// TODO Auto-generated method stub
		MyClass obj = new MyClass();

	    // Calling methods using the object
	    obj.method1();
	    obj.method2();
	}
}
