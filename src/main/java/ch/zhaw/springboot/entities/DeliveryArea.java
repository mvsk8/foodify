package ch.zhaw.springboot.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class DeliveryArea {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pk_delivery_area;
	
	@ManyToOne
	@JoinColumn(name = "fk_deliverer")
	private Deliverer deliverer;
	
	@ManyToOne
	@JoinColumn(name = "fk_town")
	private Town town;

	public DeliveryArea(Deliverer deliverer, Town town) {
		super();
		this.deliverer = deliverer;
		this.town = town;
	}

	public DeliveryArea() {

	}

	public Deliverer getDeliverer() {
		return deliverer;
	}

	public void setDeliverer(Deliverer deliverer) {
		this.deliverer = deliverer;
	}

	public Town getTown() {
		return town;
	}

	public void setTown(Town town) {
		this.town = town;
	}

	public int getPkDeliveryArea() {
		return pk_delivery_area;
	}
}
