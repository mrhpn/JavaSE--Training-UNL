package basics;

public class MyString {

	/**
	 * Strings ======= Object of class java.lang.String (JDK auto imports this
	 * class)
	 * 
	 * e.g String s = new String(); String s = new String("Hello World");
	 * 
	 * char[] cArr = {'h', 'e', 'l', 'l', 'o'} String s = new String(cArr);
	 * 
	 * String s = "hello"; // using String literal
	 * ---------------------------------------------------
	 * 
	 * Characteristics --------------- 1. String class uses character array to store
	 * text 2. Java uses UTF-16 for characters 3. String is sequence of unicode
	 * characters 4. Strings are immutable.
	 * 
	 * Operations string can do ------------------------- 1. Comparing 2. Searching
	 * 3. Examining individual characters 4. Extracting substrings 5. Case
	 * translation 6. Replace 7. Split/Join
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

		// Replace

		// ...

		String s1 = "hello!";
		String s2 = "hello!";
		String s3 = "hello!".intern();
		String s4 = new String("hello!");
		String s5 = "lo!";

		System.out.println("s1==s2: " + (s1 == s2)); // check value && reference, .equals() -> reference
		System.out.println(Integer.toHexString(s1.hashCode()));
		System.out.println(Integer.toHexString(s2.hashCode()));

		System.out.println("s1==s3: " + (s1 == s3));
		System.out.println("s1==s4: " + (s1 == s4));
		System.out.println("s1==s4.intern(): " + (s1 == s4.intern()));

		String ss = new String("abcd");
		ss = new String("1111"); // Object[abcd] will be no-reference and gc will remove later.
		System.out.println(ss);

		// string immutability
		stringImmutability();

		// String Builder (No sychronized. Thread Safe)

	}

	static void stringImmutability() {
		String s1 = new String("Hello!");
		System.out.println(s1);

		s1 = new String("1234");
		System.out.println(s1);

		String s3 = "hello!";
		String s4 = "hello!";

		s3 = "world";

		System.out.println(s3);
		System.out.println(s4);
	}

	static void stringBufferAndBuilder() {
		/**
		 * StringBuilder sb = new StringBuilder(); sb.append("hello");
		 * sb.append("world");
		 * 
		 * String s = sb.toString();
		 * 
		 * String Builder -> good performance 
		 * String Buffer -> sychronize phyit tl.
		 */
		String s = "hello " + " world!"; // jvm creates string buffer and concatact behind the scene. so low performance
		
		StringBuffer sb = new StringBuffer(s);
		sb.append(" good").append(" morning :)");
		System.out.println(sb.toString());
		System.out.println(sb.length());
		sb.delete(0,  12);
		System.out.println(sb.toString());
		System.out.println(sb.length());
		sb.insert(1, "abc");
		sb.reverse();
		sb.replace(5, 12, "evening");
		System.out.println(sb.toString());
		
	}
}
