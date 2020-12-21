package basics;

public class Employee {
	static int count = 200;
	private int salary = 10_000_000;
	
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
}
