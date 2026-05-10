package za.co.soulstice.mongo.model;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

// TODO: Auto-generated Javadoc
/**
 * The Class StatusTable.
 * 
 * @author Venki Bathula
 */
@Document(collection = "status_counter_table")
public class StatusTable {

	/** The _id. */
	private long _id;

	/** The user id. */
	private long userId;
	
	private String senderId;

	/** The delivered. */
	private int DELIVERED;

	/** The undelivered. */
	private int UNDELIVERED;

	/** The ndnc. */
	private int NDNC;

	/** The expired. */
	private int EXPIRED;

	/** The failed. */
	private int FAILED;

	/** The rejected. */
	private int REJECTED;

	/** The insertedtime. */
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss",timezone = "Asia/Calcutta")
	private Date insertedtime;

	/** The total count. */
	private long totalCount;
	
	private double smsPrice;

	/**
	 * Gets the delivered.
	 *
	 * @return the delivered
	 */
	

	public String getSenderId() {
		return senderId;
	}

	public void setSenderId(String senderId) {
		this.senderId = senderId;
	}
	
	public int getDELIVERED() {
		return DELIVERED;
	}

	/**
	 * Sets the delivered.
	 *
	 * @param dELIVERED
	 *            the new delivered
	 */
	public void setDELIVERED(int dELIVERED) {
		DELIVERED = dELIVERED;
	}

	/**
	 * Gets the undelivered.
	 *
	 * @return the undelivered
	 */
	public int getUNDELIVERED() {
		return UNDELIVERED;
	}

	/**
	 * Sets the undelivered.
	 *
	 * @param uNDELIVERED
	 *            the new undelivered
	 */
	public void setUNDELIVERED(int uNDELIVERED) {
		UNDELIVERED = uNDELIVERED;
	}

	/**
	 * Gets the ndnc.
	 *
	 * @return the ndnc
	 */
	public int getNDNC() {
		return NDNC;
	}

	/**
	 * Sets the ndnc.
	 *
	 * @param nDNC
	 *            the new ndnc
	 */
	public void setNDNC(int nDNC) {
		NDNC = nDNC;
	}

	/**
	 * Gets the expired.
	 *
	 * @return the expired
	 */
	public int getEXPIRED() {
		return EXPIRED;
	}

	/**
	 * Sets the expired.
	 *
	 * @param eXPIRED
	 *            the new expired
	 */
	public void setEXPIRED(int eXPIRED) {
		EXPIRED = eXPIRED;
	}

	/**
	 * Gets the failed.
	 *
	 * @return the failed
	 */
	public int getFAILED() {
		return FAILED;
	}

	/**
	 * Sets the failed.
	 *
	 * @param fAILED
	 *            the new failed
	 */
	public void setFAILED(int fAILED) {
		FAILED = fAILED;
	}

	/**
	 * Gets the rejected.
	 *
	 * @return the rejected
	 */
	public int getREJECTED() {
		return REJECTED;
	}

	/**
	 * Sets the rejected.
	 *
	 * @param rEJECTED
	 *            the new rejected
	 */
	public void setREJECTED(int rEJECTED) {
		REJECTED = rEJECTED;
	}

	/**
	 * Gets the _id.
	 *
	 * @return the _id
	 */
	public long get_id() {
		return _id;
	}

	/**
	 * Sets the _id.
	 *
	 * @param _id
	 *            the new _id
	 */
	public void set_id(long _id) {
		this._id = _id;
	}

	/**
	 * Gets the total count.
	 *
	 * @return the total count
	 */
	public long getTotalCount() {
		return totalCount;
	}

	/**
	 * Sets the total count.
	 *
	 * @param totalCount
	 *            the new total count
	 */
	public void setTotalCount(long totalCount) {
		this.totalCount = totalCount;
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
	 * Gets the insertedtime.
	 *
	 * @return the insertedtime
	 */
	public Date getInsertedtime() {
		return insertedtime;
	}

	/**
	 * Sets the insertedtime.
	 *
	 * @param insertedtime
	 *            the new insertedtime
	 */
	public void setInsertedtime(Date insertedtime) {
		this.insertedtime = insertedtime;
	}

	public double getSmsPrice() {
		return smsPrice;
	}

	public void setSmsPrice(double smsPrice) {
		this.smsPrice = smsPrice;
	}

}
