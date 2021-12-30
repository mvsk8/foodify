package ch.zhaw.springboot.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Deliverer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pk_deliverer;
	
	private String fullName;
	private String phone;
	
	public Deliverer(String fullName, String phone) {
		super();
		this.fullName = fullName;
		this.phone = phone;
	}

	public Deliverer() {

	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getPkDeliverer() {
		return pk_deliverer;
	}
}
