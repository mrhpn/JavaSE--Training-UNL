package basics;

public class FinalVariables {

	/**
	 * Final Variables (cannot be changed)
	 * ===============
	 * if used in primitive - value is constant
	 * if used in reference - reference is constant
	 * 
	 * ! don't have default value
	 * 
	 * Used with:
	 * 1. instance
	 * 2. local
	 * 3. static (final static PI - creating constant)
	 * 4. static initializer 
	 * static {
	 * 		final MONTHS_IN_YEAR
	 * }
	 * 
	 */
	private static final double PI_SHORT = 3.14;
	
	private final Staff staff = getStaff();
	
	public void printStaff() {
		Staff staff2 = new Staff(2, "Aung Aung", 20);
		// this.staff = staff2;
		
		System.out.println("Id: " + staff.getId());
		System.out.println("Name: " + staff.getName());
		System.out.println("Age: " + staff.getAge());
	}
	
	public static Staff getStaff() {
		Staff staff1 = new Staff(1, "Mg Mg", 20);
		return staff1;
	}
	
	public static void main(String[] args) {
		new FinalVariables().printStaff();
	}

}
