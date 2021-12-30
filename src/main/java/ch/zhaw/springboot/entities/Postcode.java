package ch.zhaw.springboot.entities;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Postcode {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pk_postcode;
	
	private int postcode;
	
	@ManyToOne
	@JoinColumn(name = "fk_town", insertable = false, updatable = false)
	@Fetch(FetchMode.JOIN)
	private Town town;

	public Postcode(int postcode, Town town) {
		super();
		this.postcode = postcode;
		this.town = town;
	}
	
	public Postcode() {
		
	}

	public int getPkPostcode() {
		return pk_postcode;
	}

	public int getPostcode() {
		return postcode;
	}

	public void setPostcode(int postcode) {
		this.postcode = postcode;
	}

	public Town getTown() {
		return town;
	}

	public void setTown(Town town) {
		this.town = town;
	}
}
