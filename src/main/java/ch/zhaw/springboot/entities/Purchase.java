package ch.zhaw.springboot.entities;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Purchase {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pk_purchase;

	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", timezone="Europe/Zurich")
	private Timestamp createTs;

	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", timezone="Europe/Zurich")
	private Timestamp purchaseTs;

	private String street;
	
	@ManyToOne
	@JoinColumn(name = "fk_postcode")
	private Postcode postcode;
	
	@ManyToOne
	@JoinColumn(name = "fk_deliverer")
	private Deliverer deliverer;
	
	@ManyToOne
	@JoinColumn(name = "fk_customer")
	private Customer customer;

	public Purchase(Timestamp createTs, Timestamp purchaseTs, String street, Postcode postcode, Deliverer deliverer,
			Customer customer) {
		super();
		this.createTs = createTs;
		this.purchaseTs = purchaseTs;
		this.street = street;
		this.postcode = postcode;
		this.deliverer = deliverer;
		this.customer = customer;
	}
	
	public Purchase() {
		
	}

	public Timestamp getCreateTs() {
		return createTs;
	}

	public void setCreateTs(Timestamp createTs) {
		this.createTs = createTs;
	}

	public Timestamp getPurchaseTs() {
		return purchaseTs;
	}

	public void setPurchaseTs(Timestamp purchaseTs) {
		this.purchaseTs = purchaseTs;
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

	public Deliverer getDeliverer() {
		return deliverer;
	}

	public void setDeliverer(Deliverer deliverer) {
		this.deliverer = deliverer;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public int getPkPurchase() {
		return pk_purchase;
	}
}
