package za.co.soulstice.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


@Entity
@Table(name = "user_sub_order")
public class UserSubOrder implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private int count;

	private String endDateAndTime;

	private String elapsedTime;

	private String fromOrderNumber;

	private String orderId;

	private String startDateAndTime;

	private String status;

	private String submittedCount;

	private String threadName;

	private String toOrderNumber;

	public UserSubOrder() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCount() {
		return this.count;
	}

	public void setCount(int i) {
		this.count = i;
	}

	public String getEndDateAndTime() {
		return this.endDateAndTime;
	}

	public void setEndDateAndTime(String endDateAndTime) {
		this.endDateAndTime = endDateAndTime;
	}

	public String getFromOrderNumber() {
		return this.fromOrderNumber;
	}

	public void setFromOrderNumber(String fromOrderNumber) {
		this.fromOrderNumber = fromOrderNumber;
	}

	public String getOrderId() {
		return this.orderId;
	}

	public void setOrderId(String tkns) {
		this.orderId = tkns;
	}

	public String getStartDateAndTime() {
		return this.startDateAndTime;
	}

	public void setStartDateAndTime(String ts) {
		this.startDateAndTime = ts;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSubmittedCount() {
		return this.submittedCount;
	}

	public void setSubmittedCount(String submittedCount) {
		this.submittedCount = submittedCount;
	}

	public String getThreadName() {
		return this.threadName;
	}

	public void setThreadName(String threadName) {
		this.threadName = threadName;
	}

	public String getToOrderNumber() {
		return this.toOrderNumber;
	}

	public void setToOrderNumber(String tkns) {
		this.toOrderNumber = tkns;
	}

	public String getElapsedTime() {
		return elapsedTime;
	}

	public void setElapsedTime(String elapsedTime) {
		this.elapsedTime = elapsedTime;
	}

}