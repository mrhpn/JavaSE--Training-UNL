package basics;

public class MyMethods {

	static int a = 100;
	
	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(Employee.count);
		
		Employee employee = new Employee();
		System.out.println("Employee salary: " + employee.getSalary());
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
