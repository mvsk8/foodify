package ch.zhaw.springboot.entities;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pk_customer;
	
	private String full_name;
	private Date birthday;
	private String email;
	private String phone;
	
	public Customer(String full_name, Date birthday, String email, String phone) {
		super();
		this.full_name = full_name;
		this.birthday = birthday;
		this.email = email;
		this.phone = phone;
	}
	
	public Customer() {
		
	}
	
	public int getPkCustomer() {
		return pk_customer;
	}
	
	public String getFull_name() {
		return full_name;
	}
	
	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}
	
	public Date getBirthday() {
		return birthday;
	}
	
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
}
