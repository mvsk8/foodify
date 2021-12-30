package ch.zhaw.springboot.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Category {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pk_category;
	
	private String name;
	
	public Category(String name) {
		super();
		this.name = name;
	}
	
	public Category() {
		
	}
	
	public int getPkCategory() {
		return pk_category;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
