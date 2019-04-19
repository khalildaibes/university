
public class Person {
	
	private String id;
	private String name;
	private String address;
	private String department;
	
	public Person(String id, String name, String address, String department) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.department = department;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	public String printCourses(){
		return null;
	}
	

}
