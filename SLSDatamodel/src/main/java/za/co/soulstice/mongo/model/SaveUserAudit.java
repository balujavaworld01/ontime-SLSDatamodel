package za.co.soulstice.mongo.model;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

@Document(collection = "user_audit_table")
public class SaveUserAudit {

	private long userId;

	private String userName;

	private String userType;

	private String userAction;

	private String userIP;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss",timezone = "Asia/Calcutta")
	private Date userActionTime;

	private String userActionMessage;

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getUserAction() {
		return userAction;
	}

	public void setUserAction(String userAction) {
		this.userAction = userAction;
	}

	public String getUserIP() {
		return userIP;
	}

	public void setUserIP(String userIP) {
		this.userIP = userIP;
	}

	public Date getUserActionTime() {
		return userActionTime;
	}

	public void setUserActionTime(Date userActionTime) {
		this.userActionTime = userActionTime;
	}

	public String getUserActionMessage() {
		return userActionMessage;
	}

	public void setUserActionMessage(String userActionMessage) {
		this.userActionMessage = userActionMessage;
	}

	public SaveUserAudit(long userId, String userName, String userType, String userAction, String userIP,
			Date userActionTime, String userActionMessage) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userType = userType;
		this.userAction = userAction;
		this.userIP = userIP;
		this.userActionTime = userActionTime;
		this.userActionMessage = userActionMessage;
	}
	
	public SaveUserAudit()
	{
		
	}

}
