package foodorder;

import java.time.LocalDateTime;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;
@Table(name = "FoodOrder")
@Entity
@Data
public class Foodorder {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nme;
	private double distance;
	@UpdateTimestamp
	private LocalDateTime deliverytime;
	@CreationTimestamp
	private LocalDateTime orderTime;
	private double price;

}
