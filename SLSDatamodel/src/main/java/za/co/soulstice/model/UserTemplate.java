/*
 * Auruminfo Powered by Soulstice.
 */
package za.co.soulstice.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "user_template")
public class UserTemplate implements Serializable {

	
	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private int id;

	
	private long userId;

	
	@Column(nullable = false)
	private String template;

	
	@Column(nullable = false)
	private boolean approved;

	
	@Column(nullable = false)
	private long approvedUserId;

	
	@Temporal(TemporalType.TIMESTAMP)
	private Date approvedDateAndTime;

	
	public int getId() {
		return id;
	}

	
	public void setId(int id) {
		this.id = id;
	}

	
	public long getUserId() {
		return userId;
	}

	
	public void setUserId(long userId) {
		this.userId = userId;
	}

	
	public String getTemplate() {
		return template;
	}

	
	public void setTemplate(String template) {
		this.template = template;
	}

	
	public boolean isApproved() {
		return approved;
	}

	
	public void setApproved(boolean approved) {
		this.approved = approved;
	}

	
	public long getApprovedUserId() {
		return approvedUserId;
	}

	
	public void setApprovedUserId(long approvedUserId) {
		this.approvedUserId = approvedUserId;
	}

	
	public Date getApprovedDateAndTime() {
		return approvedDateAndTime;
	}

	
	public void setApprovedDateAndTime(Date approvedDateAndTime) {
		this.approvedDateAndTime = approvedDateAndTime;
	}

	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}