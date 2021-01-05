package basics;

public class MyConstructor {

	/**
	 * Constructor
	 * ===========
	 * A special method
	 * 
	 * to initialize Object State
	 * 
	 * invoke when object is created: new Vehicle;
	 * 
	 * - no return type
	 * - same name with its class
	 * - can have multiple constructors but different signatures
	 * 
	 * this Keyword
	 * ============
	 * used in object. cannot be used for class and static
	 * 
	 * reference current object (new Vehicle())
	 * 
	 * - variable hiding (when different scope, same variable name)
	 */
	int num = 100;
	
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle(10_000_000, "Tesla", "red");
		Vehicle vehicle1 = new Vehicle(40_000_000, "Ford", "red");
		
		Vehicle vehicle2 = new Vehicle();
		
		System.out.println(vehicle.color);
		System.out.println(vehicle.model);
		System.out.println(vehicle.price);
		
		System.out.println(vehicle1.color);
		System.out.println(vehicle1.model);
		System.out.println(vehicle1.price);
		
		System.out.println("Updated color: " + vehicle1.updateColor("Yellow"));
		System.out.println(vehicle1.color);
		
		int num = 1000;
		System.out.println(num);
	}

}
