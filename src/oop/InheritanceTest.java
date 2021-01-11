package oop;

public class InheritanceTest {

	public static void main(String[] args) {
		Student student = new Student();
		System.out.println(student.age);
		System.out.println(student.name);
		System.out.println(student.phoneNumber);
		
		Librarian librarian = new Librarian();
		librarian.cart();
		librarian.saveBook();
		librarian.updateBook();
		
		Admin admin = new Admin();
		admin.deleteBook();
	}

}
