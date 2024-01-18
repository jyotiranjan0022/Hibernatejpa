package Compositekey;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import lombok.Data;


@Entity
@Data
public class User  {
@EmbeddedId
private Userid user;
private String name;
private long age;


}
