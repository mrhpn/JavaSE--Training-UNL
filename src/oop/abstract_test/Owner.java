package oop.abstract_test;

/**
 * Interface (used to get abstract concept, to achieve multiple inheritance)
 * < Interface also has inheritance. One interface can extend another interface >
 * =========
 * 1. 
 * 2. abstract members
 * 3. default
 * 4. static final variables (only constants)
 * 5. only public members
 * 6. can't use private and protected
 *
 */
public interface Owner extends Race {
	// constants variables
	String OWNER_RACE = "Human";
	
	// methods
	String ownerName();
	int getAge();
	String petRegistrationNo();
	
	// static methods
	static void description() {
		System.out.println("Thie is implementation details.");
	}
	
	// default method
	default void defaultTest() {
		System.out.println("This is inside default methods.");
	}
}
