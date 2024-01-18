package composite;

import java.io.Serializable;

import javax.persistence.Embeddable;


import lombok.Data;

@Data
@Embeddable
public class Userid implements Serializable {
	private long phone;
	private String email;

}
