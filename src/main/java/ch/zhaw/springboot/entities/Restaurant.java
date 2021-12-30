package ch.zhaw.springboot.entities;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Restaurant {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pk_restaurant;
	
	private String name;
	private String street;
	
	@ManyToOne
	@JoinColumn(name = "fk_postcode", insertable = false, updatable = false)
	@Fetch(FetchMode.JOIN)
	private Postcode postcode;
	
	@ManyToOne
	@JoinColumn(name = "fk_category", insertable = false, updatable = false)
	@Fetch(FetchMode.JOIN)
	private Category category;
	
	public Restaurant(String name, String street, Postcode postcode, Category category) {
		super();
		this.name = name;
		this.street = street;
		this.postcode = postcode;
		this.category = category;
	}
	
	public Restaurant() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public Postcode getPostcode() {
		return postcode;
	}

	public void setPostcode(Postcode postcode) {
		this.postcode = postcode;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public int getPkRestaurant() {
		return pk_restaurant;
	}
}
