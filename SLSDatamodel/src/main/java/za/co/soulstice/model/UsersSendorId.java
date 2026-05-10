package za.co.soulstice.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;


@Entity
@Table(name = "users_sendor_id")

public class UsersSendorId implements Serializable {

	private static final long serialVersionUID = 1L;

	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	/** The user id. */
	private long userId;

	/** The sender id. */
	private String senderId;

	/** The approved. */
	private Boolean approved;

	/** The approved user id. */
	private long approvedUserId;

	/** The approved date and t ime. */
	@Temporal(TemporalType.TIMESTAMP)
	private Date approvedDateAndTIme;

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id
	 *            the new id
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * Gets the user id.
	 *
	 * @return the user id
	 */
	public long getUserId() {
		return userId;
	}

	/**
	 * Sets the user id.
	 *
	 * @param userId
	 *            the new user id
	 */
	public void setUserId(long userId) {
		this.userId = userId;
	}

	/**
	 * Gets the sender id.
	 *
	 * @return the sender id
	 */
	public String getSenderId() {
		return senderId;
	}

	/**
	 * Sets the sender id.
	 *
	 * @param senderId
	 *            the new sender id
	 */
	public void setSenderId(String senderId) {
		this.senderId = senderId;
	}

	/**
	 * Checks if is approved.
	 *
	 * @return the approved
	 */
	public Boolean isApproved() {
		return approved;
	}

	/**
	 * Sets the approved.
	 *
	 * @param approved
	 *            the new approved
	 */
	public void setApproved(Boolean approved) {
		this.approved = approved;
	}

	/**
	 * Gets the approved user id.
	 *
	 * @return the approved user id
	 */
	public long getApprovedUserId() {
		return approvedUserId;
	}

	/**
	 * Sets the approved user id.
	 *
	 * @param approvedUserId
	 *            the new approved user id
	 */
	public void setApprovedUserId(long approvedUserId) {
		this.approvedUserId = approvedUserId;
	}

	/**
	 * Gets the approved date and t ime.
	 *
	 * @return the approved date and t ime
	 */
	public Date getApprovedDateAndTIme() {
		return approvedDateAndTIme;
	}

	/**
	 * Sets the approved date and t ime.
	 *
	 * @param approvedDateAndTIme
	 *            the new approved date and t ime
	 */
	public void setApprovedDateAndTIme(Date approvedDateAndTIme) {
		this.approvedDateAndTIme = approvedDateAndTIme;
	}

}