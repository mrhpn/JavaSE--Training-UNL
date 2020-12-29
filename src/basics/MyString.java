package basics;

public class MyString {

	/**
	 * Strings
	 * =======
	 * Object of class java.lang.String (JDK auto imports this class)
	 * 
	 * e.g
	 * String s = new String();
	 * String s = new String("Hello World");
	 * 
	 * char[] cArr = {'h', 'e', 'l', 'l', 'o'}
	 * String s = new String(cArr);
	 * 
	 * String s = "hello"; // using String literal
	 * ---------------------------------------------------
	 * 
	 * Characteristics
	 * ---------------
	 * 1. String class uses character array to store text
	 * 2. Java uses UTF-16 for characters
	 * 3. String is sequence of unicode characters
	 * 4. Strings are immutable.
	 * 
	 * Operations string can do
	 * -------------------------
	 * 1. Comparing
	 * 2. Searching
	 * 3. Examining individual characters
	 * 4. Extracting substrings
	 * 5. Case translation
	 * 6. Replace
	 * 7. Split/Join
	 */
	public static void main(String[] args) {
		String s = "hello world";
		String t = "  HELLO WORLD";
		
		System.out.println("Length: " + s.length());
		System.out.println("Empty: " + s.isEmpty());
		System.out.println("Equal: " + s.equals("Hello World"));
		System.out.println("Equal ignore case: " + s.equalsIgnoreCase("Hello World"));
		System.out.println("Compare: " + s.compareTo("Hello World")); // please do research
		
		// Searching
		System.out.println("Contain: " + s.contains("hello world !!!"));
		System.out.println("StartsWith: " + s.startsWith("hello world"));
		System.out.println("EndsWith: " + s.endsWith("hello world"));
		System.out.println("Index Of: " + s.indexOf("o"));
		System.out.println("Last Index Of: " + s.lastIndexOf("o"));
		
		// Examing
		System.out.println("CharAt: " + s.charAt(8));
		
		// Extracting Strings
		System.out.println("SubString: " + s.substring(3));
		System.out.println("SubString: " + s.substring(3, 7));
		
		// Case Translation
		System.out.println("UpperCase: " + s.toUpperCase());
		System.out.println("LowerCase: " + t.toLowerCase());
		System.out.println("Trim: " + t.trim());
		

	}

}
