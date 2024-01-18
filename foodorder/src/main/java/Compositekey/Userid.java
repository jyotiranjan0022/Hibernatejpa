package Compositekey;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.Entity;

import lombok.Data;

@Data

@Embeddable
public class Userid implements Serializable {
	
	private String email;
	private long phone;

}
