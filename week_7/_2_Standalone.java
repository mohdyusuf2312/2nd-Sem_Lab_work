package week_7;

interface Interface1 {
    void method1();
}

interface Interface2 {
    void method2();
}

class MyClass implements Interface1, Interface2 {
    public void method1() {
        System.out.println("Implementation of method1");
    }

    public void method2() {
        System.out.println("Implementation of method2");
    }
}

public class _2_Standalone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass obj = new MyClass();
        obj.method1();
        obj.method2();
	}

}
