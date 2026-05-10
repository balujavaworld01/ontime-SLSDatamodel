package za.co.soulstice.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "user_phonebook")
public class UserPhonebook implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Temporal(TemporalType.TIMESTAMP)
	private Date createdDate;

	private String createdUserId;

	private String emailId;

	private String mobileNumber;

	private String name;

	private String phonebookGroupName;

	private int userId;

	@ManyToOne
	@JoinColumn(name = "groupId")
	private UserPhoneBookGroup userPhonebookGroup;

	public UserPhonebook() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getCreatedUserId() {
		return this.createdUserId;
	}

	public void setCreatedUserId(String createdUserId) {
		this.createdUserId = createdUserId;
	}

	public String getEmailId() {
		return this.emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getMobileNumber() {
		return this.mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhonebookGroupName() {
		return this.phonebookGroupName;
	}

	public void setPhonebookGroupName(String phonebookGroupName) {
		this.phonebookGroupName = phonebookGroupName;
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public UserPhoneBookGroup getUserPhonebookGroup() {
		return this.userPhonebookGroup;
	}

	public void setUserPhonebookGroup(UserPhoneBookGroup userPhonebookGroup) {
		this.userPhonebookGroup = userPhonebookGroup;
	}

}
