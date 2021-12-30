package ch.zhaw.springboot.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Meal {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pk_meal;
	
	private String name;
	private double price;
	private String description;
	
	@ManyToOne
	@JoinColumn(name = "fk_restaurant")
	private Restaurant restaurant;

	public Meal(String name, double price, String description, Restaurant restaurant) {
		super();
		this.name = name;
		this.price = price;
		this.description = description;
		this.restaurant = restaurant;
	}
	
	public Meal() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	public int getPkMeal() {
		return pk_meal;
	}
}
