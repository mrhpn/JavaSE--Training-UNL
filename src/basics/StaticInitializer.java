package basics;

public class StaticInitializer {
	/**
	 * Static Initializer
	 * =================
	 * 1- used when initializing data structure oriented variables
	 * 2- used in exception handling
	 * 
	 * Instance Initializer
	 * ====================
	 * 1- used when initializing instance variables
	 * 2- shared code between multiple constructors
	 * 3*- copied into beginning of every constructor <! important >
	 * 
	 * 1- Static Initializer
	 * --------
	 * static HashMap map = new HashMap();
	 * static {
	 * 	map.put("Min", 100);
	 *  map.put("Max", 200);
	 * }
	 * 
	 * 2 - Static Initializer
	 * --------
	 * static {
	 * 	try {
	 *    employee = getEmployee();
	 *  } catch (Exception e) {
	 *    // catch e
	 *  }
	 * }
	 */
}
