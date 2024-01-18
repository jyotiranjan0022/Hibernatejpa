package composite;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data

public class User {
	@EmbeddedId
	private Userid userid;
	private int age;
	private String name;

private int id;

}
