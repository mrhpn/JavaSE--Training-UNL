package basics;

/**
 * POJO -> Plain Ordinary Java Object
 */
public class Student {
	public int id;
	public String name;
	public String gender;
	
	public boolean isUpdatedProfile(String newName) {
		if (newName.startsWith("Mg")) {
			name = newName;
			return true;
		}
		return false;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
}
