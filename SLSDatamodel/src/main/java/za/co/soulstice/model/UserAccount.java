/*
 * Auruminfo Powered by Soulstice.
 */
package za.co.soulstice.model;

import java.io.Serializable;

import javax.persistence.*;

import java.util.Date;

@Entity
@Table(name = "user_account")
public class UserAccount implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private double balance;

	private long balanceAddedByUserId;

	@Temporal(TemporalType.TIMESTAMP)
	private Date balanceAddedDate;

	@Temporal(TemporalType.TIMESTAMP)
	private Date balanceUpdatedDate;

	@Temporal(TemporalType.TIMESTAMP)
	private Date expiryDate;

	private double pricePerSms;

	private double taxAmount;

	private String defaultSMPPProvider;

	private String routeType;
	
	private String pendingBalance;//sri

	// bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name = "userId")
	private User user;
	
	private String stopAtQueue;
	
	

	public String getStopAtQueue() {
		return stopAtQueue;
	}

	public void setStopAtQueue(String stopAtQueue) {
		this.stopAtQueue = stopAtQueue;
	}

	public String getDefaultSMPPProvider() {
		return defaultSMPPProvider;
	}

	public void setDefaultSMPPProvider(String defaultSMPPProvider) {
		this.defaultSMPPProvider = defaultSMPPProvider;
	}

	public String getRouteType() {
		return routeType;
	}

	public void setRouteType(String routeType) {
		this.routeType = routeType;
	}

	public double getTaxAmount() {
		return taxAmount;
	}

	public void setTaxAmount(double taxAmount) {
		this.taxAmount = taxAmount;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public UserAccount() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getBalance() {
		return this.balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public long getBalanceAddedByUserId() {
		return this.balanceAddedByUserId;
	}

	public void setBalanceAddedByUserId(long balanceAddedByUserId) {
		this.balanceAddedByUserId = balanceAddedByUserId;
	}

	public Date getBalanceAddedDate() {
		return this.balanceAddedDate;
	}

	public void setBalanceAddedDate(Date balanceAddedDate) {
		this.balanceAddedDate = balanceAddedDate;
	}

	public Date getBalanceUpdatedDate() {
		return this.balanceUpdatedDate;
	}

	public void setBalanceUpdatedDate(Date balanceUpdatedDate) {
		this.balanceUpdatedDate = balanceUpdatedDate;
	}

	public Date getExpiryDate() {
		return this.expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public double getPricePerSms() {
		return pricePerSms;
	}

	public void setPricePerSms(double pricePerSms) {
		this.pricePerSms = pricePerSms;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getPendingBalance() {
		return pendingBalance;
	}

	public void setPendingBalance(String pendingBalance) {
		this.pendingBalance = pendingBalance;
	}

}