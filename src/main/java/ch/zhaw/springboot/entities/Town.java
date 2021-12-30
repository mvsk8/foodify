package ch.zhaw.springboot.entities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Town {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pk_town;
	
	private String name;
	
	public Town(String name) {
		super();
		this.name = name;
	}
	
	public Town() {
		
	}

	public int getPkTown() {
		return pk_town;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}