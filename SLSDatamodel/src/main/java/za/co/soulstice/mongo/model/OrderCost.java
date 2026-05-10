package za.co.soulstice.mongo.model;

import java.util.Date;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * The Class StatusTable.
 * 
 * @author Venki.Bathula
 */
@Document(collection = "order_cost")
public class OrderCost {

	@Indexed
	private long _id;
	
	private double cost;
	
	@Indexed
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss",timezone = "Asia/Calcutta")
	private Date insertedtime;

	@Indexed
	private long userId;
	
	
	public Date getInsertedtime() {
		return insertedtime;
	}

	public void setInsertedtime(Date insertedtime) {
		this.insertedtime = insertedtime;
	}

	public long get_id() {
		return _id;
	}

	public void set_id(long _id) {
		this._id = _id;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	

}
