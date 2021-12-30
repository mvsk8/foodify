package ch.zhaw.springboot.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class List {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pk_list;
	
	@ManyToOne
	@JoinColumn(name = "fk_purchase")
	private Purchase purchase;
	
	@ManyToOne
	@JoinColumn(name = "fk_meal")
	private Meal meal;

	public List(Purchase purchase, Meal meal) {
		super();
		this.purchase = purchase;
		this.meal = meal;
	}
	
	public List() {
		
	}

	public Purchase getPurchase() {
		return purchase;
	}

	public void setPurchase(Purchase purchase) {
		this.purchase = purchase;
	}

	public Meal getMeal() {
		return meal;
	}

	public void setMeal(Meal meal) {
		this.meal = meal;
	}

	public int getPkList() {
		return pk_list;
	}
}
