
package manytomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private long phone;
	private double perc;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="studentrelation",joinColumns = 
{@JoinColumn(name="student_id")},inverseJoinColumns = 
	{@JoinColumn(name="course_id")})
	private List<Course> course;

}
