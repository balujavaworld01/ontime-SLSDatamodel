package za.co.soulstice.mongo.model;

import java.util.Date;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

// TODO: Auto-generated Javadoc
/**
 * The Class SMS.
 */
@Document(collection = "sms_data_master_to_operator")
public class SMS {
	
	/** The _id. */
	@Indexed
	private String _id;
	
	/** The messageid. */
	private String messageid;
	
	/** The cost. */
	private String cost;
	
	/** The deliveryreporttime. */
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss",timezone = "Asia/Calcutta")
	private Date deliveryreporttime;
	
	/** The elapsedtime. */
	private Date elapsedtime;
	
	/** The errorcode. */
	private int errorcode;
	
	/** The errordescription. */
	private String errordescription;
	
	/** The insertedtime. */
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss",timezone = "Asia/Calcutta")
	@Indexed
	private Date insertedtime;
	
	/** The language. */
	private String language;
	
	/** The messagecount. */
	private int messagecount;
	
	/** The messagetype. */
	private String messagetype;
	
	/** The mobilenumber. */
	
	@Indexed
	private String mobilenumber;
	
	/** The orderid. */
	@Indexed
	private int orderid;
	
	/** The provider. */
	private String provider;
	
	/** The senderid. */
	private String senderid;
	
	/** The sessionid. */
	private String sessionid;
	
	/** The status. */
	@Indexed
	private String status;
	
	/** The userid. */
	private int userid;
	
	/** The message. */
	@Indexed
	private String message;

	/**
	 * Gets the messageid.
	 *
	 * @return the messageid
	 */
	public String getMessageid() {
		return messageid;
	}

	/**
	 * Sets the messageid.
	 *
	 * @param messageid the new messageid
	 */
	public void setMessageid(String messageid) {
		this.messageid = messageid;
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
	 * @param cost the new cost
	 */
	public void setCost(String cost) {
		this.cost = cost;
	}

	/**
	 * Gets the deliveryreporttime.
	 *
	 * @return the deliveryreporttime
	 */
	public Date getDeliveryreporttime() {
		return deliveryreporttime;
	}

	/**
	 * Sets the deliveryreporttime.
	 *
	 * @param deliveryreporttime the new deliveryreporttime
	 */
	public void setDeliveryreporttime(Date deliveryreporttime) {
		this.deliveryreporttime = deliveryreporttime;
	}

	/**
	 * Gets the elapsedtime.
	 *
	 * @return the elapsedtime
	 */
	public Date getElapsedtime() {
		return elapsedtime;
	}

	/**
	 * Sets the elapsedtime.
	 *
	 * @param elapsedtime the new elapsedtime
	 */
	public void setElapsedtime(Date elapsedtime) {
		this.elapsedtime = elapsedtime;
	}

	/**
	 * Gets the errorcode.
	 *
	 * @return the errorcode
	 */
	public int getErrorcode() {
		return errorcode;
	}

	/**
	 * Sets the errorcode.
	 *
	 * @param errorcode the new errorcode
	 */
	public void setErrorcode(int errorcode) {
		this.errorcode = errorcode;
	}

	/**
	 * Gets the errordescription.
	 *
	 * @return the errordescription
	 */
	public String getErrordescription() {
		return errordescription;
	}

	/**
	 * Sets the errordescription.
	 *
	 * @param errordescription the new errordescription
	 */
	public void setErrordescription(String errordescription) {
		this.errordescription = errordescription;
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
	 * @param insertedtime the new insertedtime
	 */
	public void setInsertedtime(Date insertedtime) {
		this.insertedtime = insertedtime;
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
	 * @param language the new language
	 */
	public void setLanguage(String language) {
		this.language = language;
	}

	/**
	 * Gets the messagecount.
	 *
	 * @return the messagecount
	 */
	public int getMessagecount() {
		return messagecount;
	}

	/**
	 * Sets the messagecount.
	 *
	 * @param messagecount the new messagecount
	 */
	public void setMessagecount(int messagecount) {
		this.messagecount = messagecount;
	}

	/**
	 * Gets the messagetype.
	 *
	 * @return the messagetype
	 */
	public String getMessagetype() {
		return messagetype;
	}

	/**
	 * Sets the messagetype.
	 *
	 * @param messagetype the new messagetype
	 */
	public void setMessagetype(String messagetype) {
		this.messagetype = messagetype;
	}

	/**
	 * Gets the mobilenumber.
	 *
	 * @return the mobilenumber
	 */
	public String getMobilenumber() {
		return mobilenumber;
	}

	/**
	 * Sets the mobilenumber.
	 *
	 * @param mobilenumber the new mobilenumber
	 */
	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	/**
	 * Gets the orderid.
	 *
	 * @return the orderid
	 */
	public int getOrderid() {
		return orderid;
	}

	/**
	 * Sets the orderid.
	 *
	 * @param orderid the new orderid
	 */
	public void setOrderid(int orderid) {
		this.orderid = orderid;
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
	 * @param provider the new provider
	 */
	public void setProvider(String provider) {
		this.provider = provider;
	}

	/**
	 * Gets the senderid.
	 *
	 * @return the senderid
	 */
	public String getSenderid() {
		return senderid;
	}

	/**
	 * Sets the senderid.
	 *
	 * @param senderid the new senderid
	 */
	public void setSenderid(String senderid) {
		this.senderid = senderid;
	}

	/**
	 * Gets the sessionid.
	 *
	 * @return the sessionid
	 */
	public String getSessionid() {
		return sessionid;
	}

	/**
	 * Sets the sessionid.
	 *
	 * @param sessionid the new sessionid
	 */
	public void setSessionid(String sessionid) {
		this.sessionid = sessionid;
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
	 * @param status the new status
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	
	/**
	 * Gets the userid.
	 *
	 * @return the userid
	 */
	@Id
	public int getUserid() {
		return userid;
	}

	/**
	 * Sets the userid.
	 *
	 * @param userid the new userid
	 */
	public void setUserid(int userid) {
		this.userid = userid;
	}

	/**
	 * Gets the _id.
	 *
	 * @return the _id
	 */
	public String get_id() {
		return _id;
	}

	/**
	 * Sets the _id.
	 *
	 * @param _id the new _id
	 */
	public void set_id(String _id) {
		this._id = _id;
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
	 * @param message the new message
	 */
	public void setMessage(String message) {
		this.message = message;
	}

}
