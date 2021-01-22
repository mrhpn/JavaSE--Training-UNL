package assignment_6_6_with_interface;

public class SqlVideoDatabase implements VideoDatabase {

	@Override
	public void store(Video video) {
		System.out.println("Stored Video into database.");
	}
}
