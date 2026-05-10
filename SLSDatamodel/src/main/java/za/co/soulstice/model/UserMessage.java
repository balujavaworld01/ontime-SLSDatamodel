package za.co.soulstice.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;

// TODO: Auto-generated Javadoc

@Entity
@Table(name = "user_messages")
public class UserMessage implements Serializable {

	
	private static final long serialVersionUID = 1L;

	
	@Id
	private int id;

	
	@Lob
	private String message;

	
	@Temporal(TemporalType.TIMESTAMP)
	private Date savedDateAndTime;

	
	private long userId;

	
	public UserMessage() {
	}

	
	public int getId() {
		return this.id;
	}

	
	public void setId(int id) {
		this.id = id;
	}

	
	public String getMessage() {
		return this.message;
	}

	
	public void setMessage(String message) {
		this.message = message;
	}

	
	public Date getSavedDateAndTime() {
		return this.savedDateAndTime;
	}

	
	public void setSavedDateAndTime(Date savedDateAndTime) {
		this.savedDateAndTime = savedDateAndTime;
	}

	
	public long getUserId() {
		return this.userId;
	}

	
	public void setUserId(long userId) {
		this.userId = userId;
	}

}