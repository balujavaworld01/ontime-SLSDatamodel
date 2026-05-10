package za.co.soulstice.mongo.model;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

// TODO: Auto-generated Javadoc
/**
 * The Class SmsDataModel.
 * 
 * @author Venki Bathula
 */
@Document(collection = "sms_data")
public class SmsDataModel {

	/** The id. */
	private String id;

	/** The inserted time. */
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss",timezone = "Asia/Calcutta")
	private Date insertedTime;

	/** The cost. */
	private String cost;

	/** The message type. */
	private String messageType;

	/** The message route. */
	private String messageRoute;

	/** The sender id. */
	private String senderId;

	/** The order serial no. */
	private String orderSerialNo;

	/** The provider. */
	private String provider;

	/** The message count. */
	private String messageCount;

	/** The language. */
	private String language;

	/** The message. */
	private String message;

	/** The mobile numbers. */
	Map<Integer, String> mobileNumbers = new HashMap<Integer, String>();

	/** The status. */
	private String status;

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id
	 *            the new id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/** The user id. */
	private String userId;

	/**
	 * Gets the user id.
	 *
	 * @return the user id
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * Sets the user id.
	 *
	 * @param userId
	 *            the new user id
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * Gets the status.
	 *
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Sets the status.
	 *
	 * @param status
	 *            the new status
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * Gets the inserted time.
	 *
	 * @return the inserted time
	 */
	public Date getInsertedTime() {
		return insertedTime;
	}

	/**
	 * Sets the inserted time.
	 *
	 * @param insertedTime
	 *            the new inserted time
	 */
	public void setInsertedTime(Date insertedTime) {
		this.insertedTime = insertedTime;
	}

	/**
	 * Gets the cost.
	 *
	 * @return the cost
	 */
	public String getCost() {
		return cost;
	}

	/**
	 * Sets the cost.
	 *
	 * @param cost
	 *            the new cost
	 */
	public void setCost(String cost) {
		this.cost = cost;
	}

	/**
	 * Gets the message type.
	 *
	 * @return the message type
	 */
	public String getMessageType() {
		return messageType;
	}

	/**
	 * Sets the message type.
	 *
	 * @param messageType
	 *            the new message type
	 */
	public void setMessageType(String messageType) {
		this.messageType = messageType;
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
	 * Gets the order serial no.
	 *
	 * @return the order serial no
	 */
	public String getOrderSerialNo() {
		return orderSerialNo;
	}

	/**
	 * Sets the order serial no.
	 *
	 * @param orderSerialNo
	 *            the new order serial no
	 */
	public void setOrderSerialNo(String orderSerialNo) {
		this.orderSerialNo = orderSerialNo;
	}

	/**
	 * Gets the provider.
	 *
	 * @return the provider
	 */
	public String getProvider() {
		return provider;
	}

	/**
	 * Sets the provider.
	 *
	 * @param provider
	 *            the new provider
	 */
	public void setProvider(String provider) {
		this.provider = provider;
	}

	/**
	 * Gets the message count.
	 *
	 * @return the message count
	 */
	public String getMessageCount() {
		return messageCount;
	}

	/**
	 * Sets the message count.
	 *
	 * @param messageCount
	 *            the new message count
	 */
	public void setMessageCount(String messageCount) {
		this.messageCount = messageCount;
	}

	/**
	 * Gets the language.
	 *
	 * @return the language
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * Sets the language.
	 *
	 * @param language
	 *            the new language
	 */
	public void setLanguage(String language) {
		this.language = language;
	}

	/**
	 * Gets the mobile numbers.
	 *
	 * @return the mobile numbers
	 */
	public Map<Integer, String> getMobileNumbers() {
		return mobileNumbers;
	}

	/**
	 * Sets the mobile numbers.
	 *
	 * @param mobileNumbers
	 *            the mobile numbers
	 */
	public void setMobileNumbers(Map<Integer, String> mobileNumbers) {
		this.mobileNumbers = mobileNumbers;
	}

	/**
	 * Gets the message.
	 *
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * Sets the message.
	 *
	 * @param message
	 *            the new message
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * Gets the message route.
	 *
	 * @return the message route
	 */
	public String getMessageRoute() {
		return messageRoute;
	}

	/**
	 * Sets the message route.
	 *
	 * @param messageRoute
	 *            the new message route
	 */
	public void setMessageRoute(String messageRoute) {
		this.messageRoute = messageRoute;
	}

}
