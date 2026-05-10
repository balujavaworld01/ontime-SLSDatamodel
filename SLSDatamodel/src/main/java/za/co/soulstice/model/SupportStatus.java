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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

// TODO: Auto-generated Javadoc
@Entity
@Table(name = "user_support")
public class SupportStatus implements Serializable {  

	
	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)                                     
	private int id;

	
	@Column(nullable = false)
	private int userId;

	
	@Column(nullable = false)
	private String requestType;

	
	@Column(length=55)
	private String request;
	
	
	@Column(nullable = false)
	private String emailId; // emailId

	
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdDate;

	
	@Temporal(TemporalType.TIMESTAMP)
	private Date resolvedDate;
	
	
	@Column(nullable = false)
	private int resolvedUserId;
	
	
	@Column(nullable = false)
	private String status;
	
	
	@Column(nullable = false)
	private String comment;

	
	public int getId() {
		return id;
	}

	
	public void setId(int id) {
		this.id = id;
	}

	
	public int getUserId() {
		return userId;
	}

	
	public void setUserId(int userId) {
		this.userId = userId;
	}

	
	public String getComment() {
		return comment;
	}

	
	public void setComment(String comment) {
		this.comment = comment;
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

	
	public Date getResolvedDate() {
		return resolvedDate;
	}

	
	public void setResolvedDate(Date resolvedDate) {
		this.resolvedDate = resolvedDate;
	}

	
	public int getResolvedUserId() {
		return resolvedUserId;
	}

	
	public void setResolvedUserId(int resolvedUserId) {
		this.resolvedUserId = resolvedUserId;
	}

	
	public String getStatus() {
		return status;
	}

	
	public void setStatus(String status) {
		this.status = status;
	}

	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	

}
