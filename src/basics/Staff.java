package basics;

public class Staff {
	private final int id;
	private final String name;
	private final int age;
	
	{
		id = 100;
		name = "mgmg";
		age = 20;
	}

	public Staff(int id, String name, int age) {
		super();
//		this.id = id;
//		this.name = name;
//		this.age = age;
	}

	public int getId() {
		return id;
	}

//	public void setId(int id) {
//		this.id = id;
//	}

	public String getName() {
		return name;
	}

//	public void setName(String name) {
//		this.name = name;
//	}

	public int getAge() {
		return age;
	}

//	public void setAge(int age) {
//		this.age = age;
//	}

}
