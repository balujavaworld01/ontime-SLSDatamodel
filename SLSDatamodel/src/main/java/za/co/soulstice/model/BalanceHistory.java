/*
 * Auruminfo Powered by Soulstice.
 */
package za.co.soulstice.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "user_account_history")

public class BalanceHistory implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private int id;

	@Column(nullable = false)
	private int userId;

	private long balanceAddedByUserId;

	private double pricePerSms;

	private double taxAmmount;

	private long accountType;

	private String orderNumber;
	
private String pendingBalance;//sri
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date balanceupdatedstatus;//sri

	@Temporal(TemporalType.TIMESTAMP)
	private Date balanceAddedDate;

	@Temporal(TemporalType.TIMESTAMP)
	private Date expiryDate;

	@Column(nullable = false)
	private double balance;

	@Column(nullable = false)
	private String invoiceNumber;

	public double getPricePerSms() {
		return pricePerSms;
	}

	public void setPricePerSms(double pricePerSms) {
		this.pricePerSms = pricePerSms;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public Date getBalanceAddedDate() {
		return balanceAddedDate;
	}

	public void setBalanceAddedDate(Date balanceAddedDate) {
		this.balanceAddedDate = balanceAddedDate;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public double getTaxAmmount() {
		return taxAmmount;
	}

	public void setTaxAmmount(double taxAmmount) {
		this.taxAmmount = taxAmmount;
	}

	public long getAccountType() {
		return accountType;
	}

	public void setAccountType(long accountType) {
		this.accountType = accountType;
	}

	public long getBalanceAddedByUserId() {
		return balanceAddedByUserId;
	}

	public void setBalanceAddedByUserId(long balanceAddedByUserId) {
		this.balanceAddedByUserId = balanceAddedByUserId;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getPendingBalance() {
		return pendingBalance;
	}

	public void setPendingBalance(String pendingBalance) {
		this.pendingBalance = pendingBalance;
	}

	public Date getBalanceupdatedstatus() {
		return balanceupdatedstatus;
	}

	public void setBalanceupdatedstatus(Date balanceupdatedstatus) {
		this.balanceupdatedstatus = balanceupdatedstatus;
	}

	
	
}