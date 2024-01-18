package hibernate.onetomany;

import java.util.ArrayList;
import java.util.Arrays;

public class SaveDepartment {
	public static void main(String[] args) {
		Department d=new Department();
		d.setName("pinku");
		d.setLocation("btm");
		Employee e1= new Employee();
		e1.setName("sonu");
		e1.setDesi("don");
		e1.setSalary(5546789);
		Employee e2= new Employee();
		e2.setName("banty");
		e2.setDesi("janini");
		e2.setSalary(5546789);
		d.setEmps(new ArrayList<Employee>(Arrays.asList(e1,e2)));
	}

}
