package t_static_factory_methods;

public class User {
	private int id;
	private String name;
	private int employeeNumber;

	// static factory method
	public static Employee createEmployee(int employeeNumber) {
		return new Employee(employeeNumber);
	}
	
	public User(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public User(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
	
	
}
