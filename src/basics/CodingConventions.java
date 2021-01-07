package basics;

public class CodingConventions {
	/**
	 * Coding Conventions
	 * ==================
	 * Naming Conventions
	 * 
	 * Package
	 * -------
	 * 1. lowercase alphabetic characters, rarely digits
	 * 2. short (< 8 characters) and single word: com.ideanet.pos
	 * 3. meaningful abbreviation: java.util
	 * 4. acronyms are fine: awt for Abstract Window Toolkits
	 * 5. never start with java and javax
	 * 
	 * Use company domain name (reversed name)
	 * www.nttat.com -> (com.nttat) 
	 * 
	 * Class
	 * -----
	 * Use PascalCase naming
	 * 
	 * Method and Variables
	 * --------------------
	 * Use camelCase naming
	 * 
	 * Static final variables
	 * ----------------------
	 * Use all capitalize characters and separate with underscore: MONTHS_IN_YEARS
	 * 
	 * Abbreviations
	 * -------------
	 * Avoid abbreviations except commonly used like min, max
	 * 
	 * Special Methods
	 * ---------------
	 * 1. Object type conversion - toType eg. toString
	 * 2. Static Factory Methods - valueOf, of, getInstance, newInstance, getType, newType
	 * 
	 * PROGRAM STRUCTURE
	 * -----------------
	 * CLASS ORGANIZATION
	 * 
	 * 1. Variables
	 * 	a. static
	 *  b. instance variables
	 * 2. Static Initializers
	 * 3. Nested static classes
	 * 4. Static methods
	 * 5. Instance Initializers (Works before constructor)
	 * 6. Constructor
	 * 7. Nested instance classes
	 * 8. Methods
	 * 
	 * Class Size
	 * ----------
	 * S Principal (Single Responsibility Principal)
	 *  - helps to get better abstractions
	 *  - helps to get few lines of code
	 * Must be between 25000 and 1200
	 * 
	 * Methods
	 * -------
	 * - small and focused (single responsibility)
	 * - refactor long methods
	 * 		- code reuse
	 * 		- clean and readable code
	 * - group methods with simpler functionality
	 * 
	 * Local Variables
	 * ---------------
	 * - declare where its first use
	 * 
	 * Lines
	 * -----
	 * - no more than 80 cols, and wrap
	 * - break line after comma; e.g: methods calls and declarations
	 * - break before operators; e.g: if blocks, arithmetic operations
	 * 
	 * Comments
	 * --------
	 * - code overview
	 * - non-obvious design decision
	 * - don't write them frequently (caused poor code quality)
	 * 
	 * Comments Types
	 * --------------
	 * - implementation comments (//, /* --- star/)
	 * - documentation comments /** --- /
	 * 
	 *
	 */
}
