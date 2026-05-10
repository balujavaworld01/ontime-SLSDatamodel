package za.co.soulstice.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

// TODO: Auto-generated Javadoc

@Entity
@Table(name = "help_desk")
@NamedQueries({ @NamedQuery(name = "HelpDesk.getSupport", query = "SELECT s FROM HelpDesk s") })
public class HelpDesk implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private long id;

	
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false)
	private String number;
	
	@Column(nullable = false)
	private String email;

	
	public String getName() {
		return name;
	}

	
	public void setName(String name) {
		this.name = name;
	}

	
	public String getNumber() {
		return number;
	}

	
	public void setNumber(String number) {
		this.number = number;
	}

	
	public String getEmail() {
		return email;
	}

	
	public void setEmail(String email) {
		this.email = email;
	}
}
