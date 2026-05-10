package za.co.soulstice.mongo.model;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "failed_sms_data")
public class FailedSmsDataModel {

	private long _id;

	private String userId;

	private Boolean completed;
	
	private Date orderedDate;

	public FailedSmsDataModel(long _id, String userId, Boolean completed, Date orderedDat) {
		super();
		this._id = _id;
		this.userId = userId;
		this.completed = completed;
		this.orderedDate=orderedDat;
	}

	public FailedSmsDataModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long get_id() {
		return _id;
	}

	public void set_id(long _id) {
		this._id = _id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Boolean getCompleted() {
		return completed;
	}

	public void setCompleted(Boolean completed) {
		this.completed = completed;
	}

	public Date getOrderedDate() {
		return orderedDate;
	}

	public void setOrderedDate(Date orderedDate) {
		this.orderedDate = orderedDate;
	}

}
