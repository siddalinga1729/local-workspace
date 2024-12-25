package practice;

public class Employee {
	private long id;
	private String firstName;
	private String secondName;
	private String department;
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", secondName=" + secondName + ", department="
				+ department + "]";
	}
	public Employee(long id, String firstName, String secondName, String department) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.secondName = secondName;
		this.department = department;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
}
