package t_static_factory_methods;

public class Employee extends User {
	
	private int employeeNumber;
	
	public Employee(int employeeNumber) {
		super(employeeNumber);
		this.employeeNumber = employeeNumber;
	}

	public Employee(int id, String name) {
		super(id, name);
	}
}
