/*
 * Auruminfo Powered by Soulstice.
 */
package za.co.soulstice.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="user_support")
public class UserSupport implements Serializable{
	
	
	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int id;
	
	
	private int userId;
	
	
	@Column(nullable=false)
	private String requestType;
	
	
	@Column(nullable=false)
	private String request;
	
	
	@Column(nullable=false)
	private String emailId;
	
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdDate;
	
	

	private String resolvedUserId;
	
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date resolvedDate;
	
	
	private int tokendetails; 
	
	
	
	public int getUserId() {
		return userId;
	}

	
	public void setUserId(int userId) {
		this.userId = userId;
	}

	
	public String getRequestType() {
		return requestType;
	}

	
	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}

	
	public String getRequest() {
		return request;
	}

	
	public void setRequest(String request) {
		this.request = request;
	}

	
	public String getEmailId() {
		return emailId;
	}

	
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	
	public Date getCreatedDate() {
		return createdDate;
	}

	
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	
	public String getResolvedUserId() {
		return resolvedUserId;
	}

	
	public void setResolvedUserId(String resolvedUderId) {
		this.resolvedUserId = resolvedUderId;
	}

	
	public Date getResolvedDate() {
		return resolvedDate;
	}

	
	public void setResolvedDate(Date resolvedDate) {
		this.resolvedDate = resolvedDate;
	}

	
	public int getId() {
		return id;
	}

	
	public void setId(int id) {
		this.id = id;
	}

	public int getTokendetails() {
		return tokendetails;
	}

	public void setTokendetails(int tokendetails) {
		this.tokendetails = tokendetails;
	}

	

}
