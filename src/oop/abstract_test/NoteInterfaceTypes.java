package oop.abstract_test;

import java.util.AbstractList;
import java.util.RandomAccess;

public class NoteInterfaceTypes {
	/**
	 * Interfaces
	 * ----------
	 * (List is implemented by arraylist, linklist and treelist.)
	 * 
	 * 1. Representative interfaces
	 * - define behavior of subclasses
	 * - include one or more implementations
	 * - public api
	 * 
	 * 2. Mixins (should end with `able`, compatable, sharable)
	 * - define additional capability of subclasses (Compatable - java.lang)
	 * - very generic - subclasses can come from anywhere
	 * 
	 * 3. Marker Interfaces (RandomAccess, Serializable)
	 * - no methods
	 * - masks a class as having some properties
	 * 
	 * 
	 * When to use Interfaces
	 * ----------------------
	 * 1. mixins
	 * 2. stateless representative behavior
	 * 
	 * When to use Abstract
	 * --------------------
	 * 1. core identity
	 * 2. skeleton implementation
	 */
	
}
