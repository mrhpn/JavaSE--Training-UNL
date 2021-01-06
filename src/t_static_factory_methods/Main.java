package t_static_factory_methods;

public class Main {

	public static void main(String[] args) {
		
		// constructor
		Employee e = new Employee(1, "Mg Mg");
		System.out.println(e.getName());
		
		User u = new User(1, "Aung Aung");
		System.out.println(u.getName());
		
		// static factory method - caller
		Employee e1 = User.createEmployee(103888);
		System.out.println(e1.getEmployeeNumber());

	}

}
