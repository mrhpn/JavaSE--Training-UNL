package oop;

public class Manager extends User {
	
	private String role;
	
//	public Manager(String role) {
//		super();
//		this.role = role;
//	}

	// Polymophrism test
	public void printRoleName() {
		System.out.println("Role manager");
	}

	public void saveBook() {
		System.out.println("Saved book in.");
	}

	public void updateBook() {
		System.out.println("Updated book in.");
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((role == null) ? 0 : role.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Manager other = (Manager) obj;
		if (role == null) {
			if (other.role != null)
				return false;
		} else if (!role.equals(other.role))
			return false;
		return true;
	}
	
	
}
