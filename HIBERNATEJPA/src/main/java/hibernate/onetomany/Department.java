package hibernate.onetomany;

import java.util.List;

public class Department {
	private String name;
	private String location;
	private List<Employee>enps;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public List<Employee> getEmps() {
		return enps;
	}
	public void setEmps(List<Employee> emps) {
		this.enps = emps;
	}

}
