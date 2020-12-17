package basics;

public class MyMethods {

	static int a = 100;
	
	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(Employee.count);
	}
	
	void sayHello() {
		System.out.println("Hello");
	}
	
	void sayHello1() {
		sayHello();
	}
	
	static void sayHello2() {
		System.out.println("Hello");
	}

}
